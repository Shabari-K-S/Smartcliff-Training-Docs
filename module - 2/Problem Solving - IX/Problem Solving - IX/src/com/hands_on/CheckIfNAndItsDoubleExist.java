package com.hands_on;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        Arrays.sort(arr);
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] * 2 == arr[j]) {
                    flag = true;
                    break outer;
                }
            }
        }
        System.out.println(flag);
    }
}
