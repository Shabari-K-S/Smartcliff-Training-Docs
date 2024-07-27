package com.self_practice;

import java.util.Scanner;

public class RectangularNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int len = 2 * n - 1;
        int[][] arr = new int[len][len];
        int startRow = 0;
        int endRow = len - 1;
        int startCol = 0;
        int endCol = len - 1;
        int num = n;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                arr[startRow][i] = num;
                arr[endRow][i] = num;
            }
            for (int i = startRow; i <= endRow; i++) {
                arr[i][startCol] = num;
                arr[i][endCol] = num;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
            num--;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}