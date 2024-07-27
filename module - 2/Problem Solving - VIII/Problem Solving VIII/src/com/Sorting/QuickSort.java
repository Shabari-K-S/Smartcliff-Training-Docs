package com.Sorting;

import java.util.Scanner;

public class QuickSort {
    // colors for text in console
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static int count = 0;

    // swapping method
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    //quick sort method for Ascending
    public static void quickSortAscending(int[] arr, int left, int right) {
        if (left < right) {
            // partition and swapping
            int pivot = arr[right];

            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            int pi = i + 1;
            swap(arr, pi, right);

            // recursion
            quickSortAscending(arr, left, pi - 1);
            quickSortAscending(arr, pi + 1, right);
        }
    }
}
