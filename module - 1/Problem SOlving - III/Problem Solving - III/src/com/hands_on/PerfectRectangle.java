package com.hands_on;

import java.util.Scanner;

public class PerfectRectangle {
    public static boolean isRectangleCover(int[][] rectangles) {
        int x1 = Integer.MAX_VALUE, x2 = Integer.MIN_VALUE, y1 = Integer.MAX_VALUE, y2 = Integer.MIN_VALUE;
        int area = 0;
        for (int[] rect : rectangles) {
            x1 = Math.min(x1, rect[0]);
            y1 = Math.min(y1, rect[1]);
            x2 = Math.max(x2, rect[2]);
            y2 = Math.max(y2, rect[3]);
            area += (rect[2] - rect[0]) * (rect[3] - rect[1]);
        }
        int expectedArea = (x2 - x1) * (y2 - y1);
        if (area != expectedArea) {
            return false;
        }
        boolean[] corners = new boolean[4];
        for (int[] rect : rectangles) {
            if (isValidCorner(rect[0], rect[1], x1, y1, corners, 0)) {
                return false;
            }
            if (isValidCorner(rect[0], rect[3], x1, y2, corners, 1)) {
                return false;
            }
            if (isValidCorner(rect[2], rect[1], x2, y1, corners, 2)) {
                return false;
            }
            if (isValidCorner(rect[2], rect[3], x2, y2, corners, 3)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCorner(int x, int y, int x1, int y1, boolean[] corners, int index) {
        if (x == x1 && y == y1) {
            if (corners[index]) {
                return true;
            }
            corners[index] = true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rectangles: ");
        int n = sc.nextInt();
        int[][] rectangles = new int[n][4];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the coordinates of rectangle " + (i+1) + ": ");
            for (int j = 0; j < 4; j++) {
                rectangles[i][j] = sc.nextInt();
            }
        }
        System.out.println(isRectangleCover(rectangles));
    }
}