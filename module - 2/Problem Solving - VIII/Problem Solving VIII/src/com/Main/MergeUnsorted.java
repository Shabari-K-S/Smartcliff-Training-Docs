package com.Main;

import com.Sorting.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeUnsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size1 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter size2 : ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr3=new int[m+n];
        for(int i=0;i<n+m;i++) {
            if(i<n) {
                arr3[i]=arr[i];
            }
            else {
                arr3[i]=arr1[i-n];
            }
        }
        BubbleSort.bubbleSortAscending(arr3);
        System.out.println(Arrays.toString(arr3));
    }

}