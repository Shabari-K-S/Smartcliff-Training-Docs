package com.self_practice;

import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary amount: ");
        int salary = sc.nextInt();
        System.out.print("Enter your year of service: ");
        int yearOfService = sc.nextInt();
        int bonus = 0;
        if (yearOfService > 5){
            bonus = (int) (salary * 0.05);
        }
        System.out.println("Bonus Amount: "+ bonus);
    }
}
