package com.assessment_i;

import java.util.Scanner;

public class TheCelebrityProblem {
    private static int findCelebrity(int[][] arr){
        int n = arr.length;
        int i=0, j=n-1;
        while (i < j){
            if (arr[i][j] == 1){
                i++;
            } else {
                j--;
            }
        }
        for (int k=0; k<n; k++){
            if (k != i && (arr[i][k] == 1 || arr[k][i] == 0)){
                return -1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people in the party: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int celebrity = findCelebrity(arr);
        if (celebrity == -1){
            System.out.println("No celebrity found");
        } else {
            System.out.println("Celebrity found at index: "+celebrity);
        }
    }
}