package com.Main;

import com.Sorting.QuickSort;

import java.util.Scanner;

public class ReversingSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size1 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int c=0;
        QuickSort.quickSortAscending(arr, 0, arr.length-1);
        QuickSort.quickSortAscending(arr1, 0, arr.length-1);
        for(int i=0;i<n;i++) {
            if(arr[i] != arr1[i]) {
                System.out.println("false");
                break;
            }
            else {
                c++;
            }
        }
        if(c == 0) {
            System.out.println("true");
        }
    }
}
