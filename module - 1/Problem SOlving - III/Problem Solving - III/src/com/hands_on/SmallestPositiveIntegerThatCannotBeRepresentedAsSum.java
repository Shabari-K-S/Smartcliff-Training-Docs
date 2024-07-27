package com.hands_on;

import java.util.Scanner;

public class SmallestPositiveIntegerThatCannotBeRepresentedAsSum {
    public static int smallestPositiveInteger(int[] arr, int n){
        int res = 1;
        for (int i = 0; i < n && arr[i] <= res; i++)
            res = res + arr[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallestPositiveInteger(arr, n));
        sc.close();
    }
}