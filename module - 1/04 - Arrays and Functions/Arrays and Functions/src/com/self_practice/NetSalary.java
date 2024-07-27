package com.hands_on;

import java.util.Scanner;

public class NetSalary {
    public double calculateNetSalary(double basicSalary, double incomeTax){
        double da = 0.7 * basicSalary;
        double hra = 0.07 * basicSalary;
        double ma = 0.02 * basicSalary;
        double ta = 0.04 * basicSalary;
        double pf = 0.12 * basicSalary;
        return basicSalary + da + hra + ma + ta - pf - incomeTax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Basic Salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter the Income/Professional Tax: ");
        double incomeTax = sc.nextDouble();

        NetSalary ns = new NetSalary();
        double netSalary = ns.calculateNetSalary(basicSalary, incomeTax);
        System.out.println("Net Salary: " + netSalary);

        sc.close();
    }
} 