/**
 * 19. Write a Java program to calculate Net Salary. User must input
 *     Basic Salary and Output should be net salary calculated based on
 *     following allowances:
 *   Allowances:
 *     DA = 70% of Basic Salary
 *     HRA = 7% of Basic Salary
 *     MA = 2% of Basic Salary
 *     TA = 4% of Basic Salary
 *   Deduction:
 *     PF = 12% of Basic Salary
 *     Income/professional tax = User Input (e.g., 500)
 *     Net Salary = Basic Salary + Allowances – Deduction
 * @author : Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.println("Enter the Income/professional tax: ");
        double tax = scanner.nextDouble();

        double DA = 0.7 * basicSalary;
        double HRA = 0.07 * basicSalary;
        double MA = 0.02 * basicSalary;
        double TA = 0.04 * basicSalary;
        double PF = 0.12 * basicSalary;

        double netSalary = basicSalary + DA + HRA + MA + TA - PF - tax;
        System.out.println("Net Salary: " + netSalary);
    }
}