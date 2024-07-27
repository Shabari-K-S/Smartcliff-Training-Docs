/**
 * 17. Write a Java program to reverse a 3-digit number
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
    }
}