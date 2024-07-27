package com.hands_on;

import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if  (a < b && b < c){
            System.out.println("Increasing order");
        } else if (a > b && b > c){
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}