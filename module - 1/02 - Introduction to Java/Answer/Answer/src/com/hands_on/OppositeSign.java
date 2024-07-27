/**
 * 24. Write a Java program to detect if two integers have opposite signs
 *     or not. Don’t use relational operator.
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class OppositeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        String[] res = {"Not opposite signs", "Opposite signs"};
        System.out.println(res[((number1 ^ number2)>>31) & 1]);
    }
}