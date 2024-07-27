/**
 * 3. Given two integer values, calculate their sum. If the two values are the same, return double their sum; otherwise, return their sum.
 * Input-1:
 * a = 1, b = 2
 * Output-1:
 * 3
 *
 * Input-2:
 * a = 3, b = 2
 * Output-2:
 * 5
 *
 * Input-3:
 * a = 2, b = 2
 * Output-3:
 * 8
 */
package com.self_practice;

import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int result = a == b ? sum * 2 : sum;
        System.out.println(result);
    }
}