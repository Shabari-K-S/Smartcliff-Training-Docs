/**
 * 25. Write a Java program that increments a given number. Don't use
 *     arithmetic operators
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class IncrementNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int incrementedNumber = -~number;
        System.out.println("Incremented Number: " + incrementedNumber);
    }
}