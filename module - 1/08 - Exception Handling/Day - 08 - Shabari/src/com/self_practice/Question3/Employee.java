package com.self_practice.Question3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
    private final int empCode;
    private final String name;
    private final String dob;
    private final String doj;

    public Employee(int empCode, String name, String dob, String doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    public void displayDetails() {
        System.out.println("------------- Employee Detail -------------");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Date of Appointment: " + doj);
        System.out.println("-------------------------------------------");
    }


    public void calculateExperience() {
        Period period = Period.between(LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Experience: " + period.getYears() + " years");
    }

}
