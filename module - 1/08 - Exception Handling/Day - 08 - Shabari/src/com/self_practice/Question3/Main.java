package com.self_practice.Question3;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Code: ");
        int empCode = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Date of Appointment (dd/MM/yyyy): ");
        String doj = scanner.nextLine();

        try {
            if (empCode <= 0) {
                throw new InvalidEmpNumberException("Invalid Employee Code. Employee code must be a positive integer.");
            }

            LocalDate dobDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dojDate = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            if (dobDate.isAfter(dojDate)) {
                throw new InvalidDateOfJoinException("Invalid Date of Appointment. Date of birth must be before Date of Appointment.");
            }

            Employee employee = new Employee(empCode, name, dob, doj);
            employee.displayDetails();
            employee.calculateExperience();
        } catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println(e.getMessage());
        }
    }
}
