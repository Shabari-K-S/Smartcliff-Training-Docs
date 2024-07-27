package com.hands_on;

import java.util.Scanner;

public class MinimumBitFlipsToConvertNumber {
    public static int minimumBitFlipsToConvertNumber(int start, int goal) {
        int count = 0;
        while (start != 0 || goal != 0) {
            if ((start & 1) != (goal & 1)) {
                count++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = sc.nextInt();
        System.out.print("Enter the goal number: ");
        int goal = sc.nextInt();
        System.out.println(minimumBitFlipsToConvertNumber(start, goal));
    }
}