package com.Main;

import com.Sorting.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++) {
            for(int j = i ;j< n ;j++) {
                if(arr[i]%2 == 0) {
                    continue;
                }
                else {
                    if(arr[j]%2 == 0 ) {
                        QuickSort.swap(arr, j, i);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}