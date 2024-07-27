package com.Main;

import java.util.Scanner;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] count(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the number for array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = count(arr);
        for(int i: res) {
            System.out.print(i + " ");
        }
    }
}
