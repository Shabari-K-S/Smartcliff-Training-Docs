package com.hands_on;

import java.util.Scanner;

public class MaximumSubsetXOR {
    public static int maximumSubsetXOR(int[] arr, int n){
        int index = 0;
        for (int i = 31; i >= 0; i--) {
            int maxElement = Integer.MIN_VALUE;
            int maxIndex = index;
            for (int j = index; j < n; j++) {
                if ((arr[j] & (1 << i)) != 0 && arr[j] > maxElement) {
                    maxElement = arr[j];
                    maxIndex = j;
                }
            }
            if (maxElement == Integer.MIN_VALUE) {
                continue;
            }
            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = temp;
            maxIndex = index;
            for (int j = 0; j < n; j++) {
                if (j != maxIndex && (arr[j] & (1 << i)) != 0) {
                    arr[j] = arr[j] ^ arr[maxIndex];
                }
            }
            index++;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= arr[i];
        }
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
        System.out.println(maximumSubsetXOR(arr, n));
    }
}