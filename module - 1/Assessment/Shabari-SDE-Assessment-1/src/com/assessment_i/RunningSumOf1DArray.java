package com.assessment_i;

import java.util.Scanner;

public class RunningSumOf1DArray {
    private static void runningSumOf1DArray(int[] arr){
        for(int i=1;i<arr.length; i++){
            arr[i] += arr[i-1];
        }
        System.out.print("The running sum of 1D array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        runningSumOf1DArray(arr);
    }
}
