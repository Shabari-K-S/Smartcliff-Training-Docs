package com.hands_on;

import java.util.Scanner;

public class TwoDArray {
    void display(int[][] arr){
        System.out.println("The Two-Dimensional Array: ");
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int rowSize = sc.nextInt();
        System.out.print("Enter the column size: ");
        int columnSize = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[][] array = new int[rowSize][columnSize];
        for(int row=0; row<rowSize; row++){
            for(int col=0; col<columnSize; col++){
                array[row][col] = sc.nextInt();
            }
        }
        TwoDArray twodarr = new TwoDArray();
        twodarr.display(array);
    }
}
