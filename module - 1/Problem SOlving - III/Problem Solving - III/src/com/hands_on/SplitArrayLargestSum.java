package com.hands_on;

import java.util.Scanner;

public class SplitArrayLargestSum {
    public static int splitArrayLargestSum(int[] arr, int n, int k){
        int low = 0;
        int high = 0;
        for (int i = 0; i < n; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            int count = 1;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum > mid) {
                    sum = arr[i];
                    count++;
                }
            }
            if (count <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(splitArrayLargestSum(arr, n, k));
    }
}