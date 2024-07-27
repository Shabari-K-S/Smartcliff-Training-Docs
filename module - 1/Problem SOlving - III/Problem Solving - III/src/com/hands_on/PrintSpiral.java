package com.hands_on;

import java.util.Scanner;

public class PrintSpiral {
    public static void printSpiral(int[][] arr, int n, int m) {
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of t: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the value of N and M: ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            printSpiral(arr, n, m);
            System.out.println();
        }
    }
}