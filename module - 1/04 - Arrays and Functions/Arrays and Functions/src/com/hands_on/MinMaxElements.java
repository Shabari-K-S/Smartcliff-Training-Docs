package com.hands_on;

import java.util.Scanner;

public class MinMaxElements {
    public void findMinMax(int row, int col, int[][] arr){
        System.out.println("Given Array is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<row; i++){
            int minRow = Integer.MAX_VALUE;
            int maxRow = Integer.MIN_VALUE;
            for(int j=0; j<col; j++){
                if(arr[i][j] < minRow){
                    minRow = arr[i][j];
                }
                if(arr[i][j] > maxRow){
                    maxRow = arr[i][j];
                }
            }
            System.out.println("The minimum and maximum element of "+(i+1)+" row is: "+minRow+", "+maxRow);
        }
        for(int i=0; i<col; i++){
            int minCol = Integer.MAX_VALUE;
            int maxCol = Integer.MIN_VALUE;
            for(int j=0; j<row; j++){
                if(arr[j][i] < minCol){
                    minCol = arr[j][i];
                }
                if(arr[j][i] > maxCol){
                    maxCol = arr[j][i];
                }
            }
            System.out.println("The minimum and maximum element of "+(i+1)+" column is: "+minCol+", "+maxCol);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter "+row+" * "+col+" array elements are: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        MinMaxElements mme = new MinMaxElements();
        mme.findMinMax(row, col, arr);

        sc.close();
    }
}