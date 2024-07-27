package com.hands_on;

import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] concatenationOfArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = concatenationOfArray(arr);
        System.out.println("The array is: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}