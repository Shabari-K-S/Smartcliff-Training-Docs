package com.hands_onn;

import java.util.*;

public class NumberOfDistinctIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter the elements of the grid : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("The number of distinct islands are : " + numberOfDistinctIslands(grid));
    }

    private static int numberOfDistinctIslands(int[][] grid) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, "o");
                    set.add(sb.toString());
                    System.out.println(set);
                }
            }
        }
        return set.size();
    }

    private static void dfs(int[][] grid, int i, int j, StringBuilder sb, String dir) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        sb.append(dir);
        dfs(grid, i + 1, j, sb, "d");
        dfs(grid, i - 1, j, sb, "u");
        dfs(grid, i, j + 1, sb, "r");
        dfs(grid, i, j - 1, sb, "l");
        sb.append("b");

    }
}