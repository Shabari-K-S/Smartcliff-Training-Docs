package com.hands_on;

import java.util.Scanner;

public class MinimumCommonValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the second array size: ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for( int j = 0; j < m; j++){
                if (arr[i] == arr2[j]){
                    min = Math.min(min, arr[i]);
                }
            }
        }
        System.out.println("Minimum Common Value: " + min);
    }
}
