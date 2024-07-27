package com.hands_on;

import java.util.Scanner;

public class MaxCircularSubarraySum {
    public static int normalMaxSum(int[] a, int n){
        int res = a[0];
        int maxEnd = a[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + a[i], a[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }

    public static int circularSubarraySum(int[] a, int n) {
        int max_normal = normalMaxSum(a, n);
        if (max_normal < 0) {
            return max_normal;
        }
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += a[i];
            a[i] = -a[i];
        }
        int maxCircular = arr_sum + normalMaxSum(a, n);
        return Math.max(maxCircular, max_normal);
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
        System.out.println(circularSubarraySum(arr, n));
    }
}