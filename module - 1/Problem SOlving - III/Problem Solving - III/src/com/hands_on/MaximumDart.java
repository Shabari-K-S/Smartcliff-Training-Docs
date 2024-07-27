package com.hands_on;

import java.util.Scanner;

public class MaximumDart {
    private static int maximumDart(int r, int rows, int cols, int[][] arr){
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(Math.abs(arr[i][j])==r){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(maximumDart(r,rows, cols, arr));
    }
}

