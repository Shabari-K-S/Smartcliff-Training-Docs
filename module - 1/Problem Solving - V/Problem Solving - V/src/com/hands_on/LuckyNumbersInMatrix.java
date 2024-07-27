
package com.hands_on;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbersInMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean flag = true;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][minIndex] > min){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result.add(min);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = luckyNumbers(arr);
        System.out.print("The lucky numbers in the matrix: ");
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}