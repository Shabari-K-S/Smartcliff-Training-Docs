package com.self_practice;

import java.util.Scanner;

public class MinimumHp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M: ");
        int m = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Output :");
        System.out.println(minimumHP(matrix));
    }

    public static int minimumHP(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = Math.max(1, 1 - matrix[m - 1][n - 1]);
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - matrix[i][n - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            dp[m - 1][i] = Math.max(1, dp[m - 1][i + 1] - matrix[m - 1][i]);
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int right = Math.max(1, dp[i][j + 1] - matrix[i][j]);
                int down = Math.max(1, dp[i + 1][j] - matrix[i][j]);
                dp[i][j] = Math.min(right, down);
            }
        }
        return dp[0][0];
    }
}