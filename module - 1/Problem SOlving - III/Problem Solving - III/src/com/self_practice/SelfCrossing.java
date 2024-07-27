package com.self_practice;

import java.util.Scanner;

public class SelfCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] distance = new int[4];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < 4; i++) {
            distance[i] = sc.nextInt();
        }
        System.out.print("Output :");
        System.out.println(isSelfCrossing(distance));
    }

    public static boolean isSelfCrossing(int[] distance) {
        int x = 0, y = 0;
        int n = distance.length;
        int[][] dirs = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int dir = 0;
        for (int i = 0; i < n; i++) {
            int[] d = dirs[dir];
            x += d[0] * distance[i];
            y += d[1] * distance[i];
            if (i >= 3 && (distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3] ||
                    i >= 4 && distance[i - 1] == distance[i - 3] && distance[i] + distance[i - 4] >= distance[i - 2])) {
                return true;
            }
            dir = (dir + 1) % 4;
        }
        return false;
    }
}