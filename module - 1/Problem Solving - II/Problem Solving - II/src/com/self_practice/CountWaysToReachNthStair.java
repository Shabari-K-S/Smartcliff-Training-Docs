package com.self_practice;

import java.util.Scanner;

class CountWaysToReachNthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println("Number of ways = " + countWays(n));
    }

    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
}
