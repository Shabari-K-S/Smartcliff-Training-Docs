package com.self_practice;

import java.util.Scanner;
import java.util.Arrays;

public class MinimizeManhattanDistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.print("Output :");
        System.out.println(minimizeManhattanDistances(points));
    }

    public static int minimizeManhattanDistances(int[][] points) {
        int n = points.length;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                max = Math.min(max, dist);
            }
        }
        return max;
    }
}