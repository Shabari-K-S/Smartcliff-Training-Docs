package com.hands_on;

import java.util.Scanner;

public class IndexExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array 1: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the array 2: ");
        int[] arr2 = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            if(arr[i] != arr2[i]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
