package com.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

/*

    4 1 3 6
    0 1 2 3

    1 ->  4 | 1                 => key = arr[i]
                                => j >= 0 && arr[j] > key
                                => 1>=0  = t && 4 > 1 = t
                                => arr[j] = arr[i] => 1 1 3 6
                                => j-=1

                                => arr[j] = key    => 1 4 3 6

    2 -> 1 4 | 3                =>
 */
