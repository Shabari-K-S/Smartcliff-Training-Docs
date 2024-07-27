package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class WiggleSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        System.out.println("Enter the a:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        wiggleSort(nums);
        System.out.println("Reordered array: " + Arrays.toString(nums));
        sc.close();
    }

    public static void wiggleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((i % 2 == 0 && nums[i] > nums[i + 1]) || (i % 2 == 1 && nums[i] < nums[i + 1])) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
    }
}
