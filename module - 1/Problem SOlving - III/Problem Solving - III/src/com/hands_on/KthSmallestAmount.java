package com.hands_on;

import java.util.Scanner;

public class KthSmallestAmount {
    public static int kthSmallestAmount(int[] coins, int k) {
        int n = coins.length;
        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= k; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        for (int i = 1; i <= k; i++) {
            if (dp[i] >= k) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coins: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the elements of the coins: ");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(kthSmallestAmount(coins, k));
    }
}