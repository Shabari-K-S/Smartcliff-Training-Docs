package com.self_practice;

import java.util.Scanner;

public class FindXorBeautyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Xor-Beauty of the array = " + xorBeauty(arr));
    }

    public static int xorBeauty(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int j : nums) {
            for (int k : nums) {
                for (int num : nums) {
                    ans ^= ((j | k) & num);
                }
            }
        }
        return ans;
    }
}