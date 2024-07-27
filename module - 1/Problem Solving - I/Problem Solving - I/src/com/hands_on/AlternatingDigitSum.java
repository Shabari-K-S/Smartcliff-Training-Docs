package com.hands_on;

import java.util.Scanner;

public class AlternatingDigitSum {
    public static int alternatingDigitSum(int n) {
        String num = String.valueOf(n);
        int sum = num.charAt(0) - '0';
        for (int i = 1; i < num.length(); i++) {
            if (i % 2 == 0) {
                sum += num.charAt(i) - '0';
            } else {
                sum -= num.charAt(i) - '0';
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(alternatingDigitSum(userInput));
    }
}