/**
 * 9. Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b.
 * Input:
 * a = 2, b = 3
 * Output:
 * 5
 *
 * Input:
 * a = 8, b = 3
 * Output:
 * 8
 */

package com.self_practice;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int sumDigits = String.valueOf(sum).length();
        int aDigits = String.valueOf(a).length();
        if (sumDigits == aDigits) {
            System.out.println(sum);
        } else {
            System.out.println(a);
        }
    }
}