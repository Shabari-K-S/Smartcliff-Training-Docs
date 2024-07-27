package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class PancakeFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements (n):");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] flips = pancakeSort(arr);
        System.out.println("Pancake flips: " + Arrays.toString(flips));
        sc.close();
    }

    public static int[] pancakeSort(int[] A) {
        int n = A.length;
        int[] flips = new int[2 * n];
        int flipCount = 0;

        for (int x = n; x > 0; --x) {
            int i;
            for (i = 0; A[i] != x; ++i);
            if (i != x - 1) {
                if (i != 0) {
                    flip(A, i + 1);
                    flips[flipCount++] = i + 1;
                }
                flip(A, x);
                flips[flipCount++] = x;
            }
        }

        return Arrays.copyOf(flips, flipCount);
    }

    private static void flip(int[] A, int k) {
        for (int left = 0, right = k - 1; left < right; ++left, --right) {
            int tmp = A[left];
            A[left] = A[right];
            A[right] = tmp;
        }
    }
}
