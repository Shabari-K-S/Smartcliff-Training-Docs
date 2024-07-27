package com.hands_on;

import java.util.Scanner;

public class XORDare {
    public static int maxStrength(int[] arr, int k) {
        int n = arr.length;
        int maxStrength = 0;
        for (int i = 0; i < (1 << n); i++) {
            int strength = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    strength ^= arr[j];
                }
            }
            maxStrength = Math.max(maxStrength, strength ^ k);
        }
        return maxStrength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the number of elements and k: ");
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The maximum strength is: " + maxStrength(arr, k));
        }
    }
}