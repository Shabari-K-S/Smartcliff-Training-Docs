package com.hands_on;

public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, -2, 3 }, { -4, -5, 6 }, { 7, -8, 9 } };
        int cnt = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
