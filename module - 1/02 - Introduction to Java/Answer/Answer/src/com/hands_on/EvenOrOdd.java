/**
 * 23. Write a Java program to check whether the given number is odd
 *     or even. Don’t use comparison operator and decision statement.
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        String[] result = {"Even", "Odd"};
        System.out.println(result[number & 1]);

    }
}