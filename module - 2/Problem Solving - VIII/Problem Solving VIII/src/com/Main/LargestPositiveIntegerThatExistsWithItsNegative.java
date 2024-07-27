package com.Main;

import com.Sorting.BubbleSort;
import com.Sorting.QuickSort;

import java.util.Scanner;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static int maxValPresent(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        QuickSort.quickSortAscending(arr, i, j);
        while (i < j) {
            if ((arr[i] * -1) == arr[j]) {
                return arr[j];
            } else if ((arr[i] * -1) > arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter an integer: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Largest Positive Integer that exists with it's negative: " + maxValPresent(arr));
    }
}
