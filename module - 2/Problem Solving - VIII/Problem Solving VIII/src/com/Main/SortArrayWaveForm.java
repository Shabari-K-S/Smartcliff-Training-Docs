package com.Main;

import com.Sorting.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWaveForm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of query: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n-1; i+=2) {
                QuickSort.swap(arr, i, i+1);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
