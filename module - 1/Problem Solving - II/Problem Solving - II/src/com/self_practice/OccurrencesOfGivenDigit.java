package com.self_practice;

import java.util.Scanner;

public class OccurrencesOfGivenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the digit: ");
        int d = sc.nextInt();
        System.out.println("Number of occurrences = " + countOccurrences(n, d));
    }

    public static int countOccurrences(int n, int d) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}