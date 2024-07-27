package com.Main;

import com.Sorting.QuickSort;

import java.util.*;

public class Intersection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size1 : ");
        int n = sc.nextInt();
        System.out.println("Enter size2 : ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        QuickSort.quickSortAscending(arr,0, n-1);
        QuickSort.quickSortAscending(arr1,0, m-1);
        if(n>m) {
            for(int i=0;i<m;i++) {
                for(int j=i+1;j<n;j++) {
                    if(arr1[i] == arr[j]) {
                        System.out.println(arr1[i]);
                        break;
                    }

                }
            }
        }
        else {
            for(int i=0;i<n;i++) {
                for(int j=i+1;j<m;j++) {
                    if(arr[i] == arr1[j]) {
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }

    }

}
