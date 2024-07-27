package com.hands_on;

import java.util.Scanner;

public class LongestConsecutiveOnes {
    public static int longestConsecutiveOnes(int n) {
        int count = 0;
        int maxCount = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            n >>= 1;
        }
        return Math.max(maxCount, count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(longestConsecutiveOnes(userInput));
    }
}