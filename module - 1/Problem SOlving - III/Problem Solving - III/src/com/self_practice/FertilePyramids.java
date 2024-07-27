package com.self_practice;

import java.util.Scanner;

public class FertilePyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M: ");
        int m = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.print("Enter the matrix elements: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print("Output :");
        System.out.println(countFertilePyramids(grid));
    }

    public static int countFertilePyramids(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int h = 2; h <= m; h++) {
                    if (i + h - 1 < m && j - (h - 1) >= 0 && j + (h - 1) < n) {
                        boolean flag = true;
                        for (int k = 0; k < h; k++) {
                            if (grid[i + k][j - k] == 0 || grid[i + k][j + k] == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            count++;
                        }
                    }
                    if (i - h + 1 >= 0 && j - (h - 1) >= 0 && j + (h - 1) < n) {
                        boolean flag = true;
                        for (int k = 0; k < h; k++) {
                            if (grid[i - k][j - k] == 0 || grid[i - k][j + k] == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}