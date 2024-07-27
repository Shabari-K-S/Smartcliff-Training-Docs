/**
 * Input: num = 4, t = 1
 * Output: 6
 * Explanation: The maximum achievable number is x = 6; it can become
 * equal to num after performing this operation:
 * 1- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5.
 * It can be proven that there is no achievable number larger than 6.
 */

package com.hands_on;

import java.util.Scanner;

public class MaximumAchievableNumber {
    public static int maximumAchievableNumber(int num, int t) {
        int result = num;
        for (int i = 1; i <= t; i++) {
            int temp = num - i;
            if (temp < 0) {
                break;
            }
            result = Math.max(result, temp + (t - i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.print("Enter number of operations: ");
        int operations = sc.nextInt();
        System.out.println(
                "Maximum Achievable Number: "
                        +maximumAchievableNumber(userInput, operations)
        );
    }
}