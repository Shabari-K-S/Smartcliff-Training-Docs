package com.hands_on;

import java.util.Scanner;

public class MiningDiamonds {
    public static int miningDiamonds(int[] a, int n){
        int[] b = new int[n+2];
        b[0] = b[n+1] = 1;
        if (n >= 0) System.arraycopy(a, 0, b, 1, n);
        int[][] dp = new int[n+2][n+2];
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k-1] + dp[k+1][j] + b[i-1] * b[k] * b[j+1]);
                }
            }
        }
        return dp[1][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of T: ");
        int t = sc.nextInt();
        while(t>0){
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(miningDiamonds(a, n));
            t--;
        }
    }
}