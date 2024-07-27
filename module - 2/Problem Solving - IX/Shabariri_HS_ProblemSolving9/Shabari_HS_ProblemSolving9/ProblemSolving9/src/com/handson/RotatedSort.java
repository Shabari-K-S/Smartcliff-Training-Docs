package com.handson;

import java.util.Scanner;

public class RotatedSort {

    public static int search(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == t) {
                return mid;
            }

            if (arr[l] <= arr[mid]) {
                if (arr[l] <= t && t < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else { 
                if (arr[mid] < t && t <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int t = sc.nextInt();
        int index = search(a, t);
        if (index != -1) {
            System.out.println(index);
        }
        else {
            System.out.println(" not found ");
        }
		
	}

}
