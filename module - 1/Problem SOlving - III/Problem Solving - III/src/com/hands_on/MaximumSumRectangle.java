package com.hands_on;

import java.util.Scanner;

public class MaximumSumRectangle {
    public static int maximumSumRectangle(int[][] arr, int m, int n){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < m; k++) {
                    for (int l = j; l < n; l++) {
                        int sum = 0;
                        for (int p = i; p <= k; p++) {
                            for (int q = j; q <= l; q++) {
                                sum += arr[p][q];
                                System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", sum = " + sum);
                            }
                        }
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int t = sc.nextInt();
        while(t>0){
            System.out.print("Enter the size of row: ");
            int m = sc.nextInt();
            System.out.print("Enter the size of column: ");
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(maximumSumRectangle(arr, m, n));
            t--;
        }
    }
}