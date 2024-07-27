package com.self_practice;

import java.util.Scanner;

public class MinimizeOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("K: ");
        int k = sc.nextInt();
        System.out.print("Output :");
        System.out.println(minimizeOR(nums, k));
    }

    public static int minimizeOR(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i] & nums[i+1];
            nums[i+1] = 0;
            k--;
            if (k<=0)
                break;
        }
        int result=0;
        for (int i: nums){
            if (i != 0)
                result++;
        }
        return result;
    }
}