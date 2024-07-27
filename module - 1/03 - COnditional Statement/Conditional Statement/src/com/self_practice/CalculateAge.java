package com.self_practice;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Age: "+ period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
    }
}