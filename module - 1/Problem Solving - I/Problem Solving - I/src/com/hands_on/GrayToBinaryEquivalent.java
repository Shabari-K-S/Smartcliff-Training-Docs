package com.hands_on;

import java.util.Scanner;

public class GrayToBinaryEquivalent {
    public static int grayToBinaryEquivalent(int n) {
        int result = n;
        while (n > 0) {
            n >>= 1;
            result ^= n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(grayToBinaryEquivalent(userInput));
    }
}