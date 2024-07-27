package com.hands_on;

import java.util.Scanner;

public class OnefulPairs {
    public static String isOnefulPair(int a, int b) {
        if(a+b+(a*b) == 111){
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(isOnefulPair(a, b));
    }
}