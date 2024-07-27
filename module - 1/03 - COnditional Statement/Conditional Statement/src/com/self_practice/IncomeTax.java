package com.self_practice;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        int income = sc.nextInt();
        int taxAmount = 0;
        if (income > 250000){
            taxAmount = (int) ((income - 250000) * 0.10);
            System.out.println("Tax amount is "+ taxAmount);
        } else {
            System.out.println("You are exempted from tax");
        }
    }
}