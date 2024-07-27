/**
 * 10. Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
 */

package com.self_practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz!");
        } else if (n % 3 == 0) {
            System.out.println("Fizz!");
        } else if (n % 5 == 0) {
            System.out.println("Buzz!");
        } else {
            System.out.println(n + "!");
        }
    }
}