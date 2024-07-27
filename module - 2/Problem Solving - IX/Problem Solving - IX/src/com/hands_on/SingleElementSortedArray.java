package com.hands_on;

import java.util.Scanner;

public class SingleElementSortedArray {
    public static int findSingleElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findSingleElement(arr));
    }
}
