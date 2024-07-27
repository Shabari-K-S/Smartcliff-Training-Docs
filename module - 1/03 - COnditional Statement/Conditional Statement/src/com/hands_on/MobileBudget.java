package com.hands_on;

import java.util.Scanner;

public class MobileBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the mobile: ");
        int mobileCost = sc.nextInt();
        if  (mobileCost <= 15000){
            System.out.println("Mobile chosen is within the budget");
        } else {
            System.out.println("Mobile chosen is beyond the budget");
        }
    }
}