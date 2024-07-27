package com.self_practice;

import java.util.Scanner;
import java.util.Arrays;

public class MakeArrayZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum number of operations: " + makeArrayZero(arr));
    }

    public static int makeArrayZero(int[] nums) {
        final boolean[] set = new boolean[101];
        for(final int a : nums)
            if(a > 0)
                set[a] = true;
        int count = 0;
        for (boolean b : set)
            if (b)
                count++;
        return count;
    }
}