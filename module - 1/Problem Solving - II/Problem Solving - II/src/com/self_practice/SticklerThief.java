package com.self_practice;

import java.util.Scanner;

public class SticklerThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of houses: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the amount of money in each house: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum money the thief can get = " + maxMoney(arr));
    }

    public static int maxMoney(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return arr[0];
        }
        if (n == 2) {
            return Math.max(arr[0], arr[1]);
        }
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
        }
        return dp[n - 1];
    }
}