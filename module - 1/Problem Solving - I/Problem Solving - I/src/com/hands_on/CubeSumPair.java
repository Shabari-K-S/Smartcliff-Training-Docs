package com.hands_on;

import java.util.Scanner;

public class CubeSumPair {
    public static int cubeSumPairs(int n) {
        int count = 0;
        for (int i = 1; i * i * i < n; i++) {
            int b = n - i * i * i;
            int c = (int) Math.cbrt(b);
            if (c * c * c == b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(cubeSumPairs(userInput));
    }
}