package com.hands_on;

import java.util.Scanner;

public class FibonacciSum {
    public static int fibonacciSum(int n) {
        int sum = 1,f = 0, s = 1;
        for(int i = 2; i <= n; i++) {
            int next = f + s;
            f = s;
            s = next;
            sum += next;
        }
        return sum % 1000000007;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        System.out.println(fibonacciSum(num));
    }
}
