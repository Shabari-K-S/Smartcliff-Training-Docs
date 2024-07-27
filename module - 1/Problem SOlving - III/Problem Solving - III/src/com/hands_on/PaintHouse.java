package com.hands_on;

import java.util.Scanner;

public class PaintHouse {
    public static int minCost(int[][] costs, int n, int k) {
        int[][] dp = new int[n][k];
        for (int i = 0; i < k; i++) {
            dp[0][i] = costs[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int l = 0; l < k; l++) {
                    if (l != j) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][l] + costs[i][j]);
                    }
                }
            }
        }
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            minCost = Math.min(minCost, dp[n - 1][i]);
        }
        return minCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of T: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the value of N and K: ");
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] costs = new int[n][k];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    costs[i][j] = sc.nextInt();
                }
            }
            System.out.println(minCost(costs, n, k));
        }
    }
}