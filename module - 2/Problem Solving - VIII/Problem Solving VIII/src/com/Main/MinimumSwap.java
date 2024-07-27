package com.Main;


import com.Sorting.QuickSort;

import java.util.Scanner;

public class MinimumSwap {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size1 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c=0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min]) {
                    min = j;
                    c++;
                }
            QuickSort.swap(arr, min, i);
        }
        System.out.println(c-1);
    }
}
