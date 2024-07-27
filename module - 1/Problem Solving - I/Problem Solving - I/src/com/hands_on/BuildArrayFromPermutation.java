package com.hands_on;

import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static int[] buildArrayFromPermutation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
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
        int[] result = buildArrayFromPermutation(arr);
        System.out.println("The array is: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}