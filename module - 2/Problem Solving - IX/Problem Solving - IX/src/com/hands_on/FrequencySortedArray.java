package com.hands_on;

import java.util.Scanner;

public class FrequencySortedArray {
    static void printFreq(int arr[], int N)
    {
        int freq = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            }
            else {
                if (freq > max) {
                    max = freq;
                }
                freq = 1;
            }

        }
        System.out.println("Max Freq: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printFreq(arr, n);
    }
}
