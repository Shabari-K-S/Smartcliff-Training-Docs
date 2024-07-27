package com.hands_on;

import java.util.Scanner;

public class CountHillsAndValleysInAnArray {
    public static int countHillsAndValleysInAnArray(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
                if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                    count++;
                } else if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
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
        System.out.println("The number of hills and valleys in the array is: " + countHillsAndValleysInAnArray(arr));
    }
}