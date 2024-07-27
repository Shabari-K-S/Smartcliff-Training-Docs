package com.self_practice;

import java.util.Scanner;

class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        System.out.println("Largest prime factor = " + largestPrimeFactor(n));
    }

    public static long largestPrimeFactor(long n) {
        long i;
        long max = -1;

        while (n % 2 == 0) {
            max = 2;
            n >>= 1;
        }

        for (i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                max = i;
                n = n / i;
            }
        }

        if (n > 2) {
            max = n;
        }

        return max;
    }
}