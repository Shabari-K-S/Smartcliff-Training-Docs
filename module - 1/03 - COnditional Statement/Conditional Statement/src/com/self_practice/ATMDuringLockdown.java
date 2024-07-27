package com.self_practice;

import java.util.Scanner;

public class ATMDuringLockdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int balance = 10000;

        if (amount % 500 == 0){
            System.out.println("Valid amount, transaction in process");
        } else {
            System.out.println("Please enter amount multiple of 500");
        }
    }
}