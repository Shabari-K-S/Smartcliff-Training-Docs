package com.Sorting;

public class BubbleSort {
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
    public static void bubbleSortAscending(int[] arr) {
        int len = arr.length;
        for ( int i = 0; i < len; i++) {
            if (isSorted(arr,len))
                break;

            for (int j = 0; j < len - 1; j++) {
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
