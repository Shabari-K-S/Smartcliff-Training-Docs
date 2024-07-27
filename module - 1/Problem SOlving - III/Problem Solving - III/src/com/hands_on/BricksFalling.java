package com.hands_on;

import java.util.Scanner;

public class BricksFalling {
    public static int[] hitBricks(int[][] grid, int[][] hits) {
        int n = grid[0].length;
        for (int[] hit : hits) {
            grid[hit[0]][hit[1]]--;
        }
        for (int i = 0; i < n; i++) {
            dfs(grid, 0, i);
        }
        int[] res = new int[hits.length];
        for (int i = hits.length - 1; i >= 0; i--) {
            int r = hits[i][0], c = hits[i][1];
            if (grid[r][c] == 0) {
                continue;
            }
            grid[r][c]++;
            if (!isConnected(grid, r, c)) {
                continue;
            }
            res[i] = dfs(grid, r, c) - 1;
        }
        return res;
    }

    private static int dfs(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;
        return 1 + dfs(grid, r + 1, c) + dfs(grid, r - 1, c) + dfs(grid, r, c + 1) + dfs(grid, r, c - 1);
    }

    private static boolean isConnected(int[][] grid, int r, int c) {
        if (r == 0) {
            return true;
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int[] dir : dirs) {
            int nr = r + dir[0], nc = c + dir[1];
            if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter the elements of the grid: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number of hits: ");
        int k = sc.nextInt();
        int[][] hits = new int[k][2];
        System.out.println("Enter the elements of the hits: ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 2; j++) {
                hits[i][j] = sc.nextInt();
            }
        }
        int[] result = hitBricks(grid, hits);
        System.out.print("Output: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}