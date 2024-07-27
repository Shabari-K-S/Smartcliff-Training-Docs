package com.hands_on;

import java.util.Scanner;

public class NumberOf1Bits {
    public static int numberOf1Bits(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(numberOf1Bits(userInput));
    }
}