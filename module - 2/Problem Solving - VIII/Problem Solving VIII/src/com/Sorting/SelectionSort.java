package com.Sorting;

public class SelectionSort {
    public static boolean isSorted(int[] arr, int len) {
        boolean flag = true;
        for (int i=0; i<len-1; i++ ) {
            if (arr[i] > arr[i+1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void selectionSortAscending(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            if (isSorted(arr,len))
                break;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


/*
    7 9 4 1 3

    1 -> 7 | 9                  => 7 > 9 = false
    2 -> 7 | 9 4                => 7 > 4 = true   => 4 9 7 1 3
    3 -> 4 | 9 7 1              => 4 > 1 = true   => 1 9 7 4 3
    4 -> 1 | 9 7 4 3            => 1 > 3 = false

    1 9 7 4 3

    1 -> 1 9 | 7                => 9 > 7 = true   => 1 7 9 4 3



 */