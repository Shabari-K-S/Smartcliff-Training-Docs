package com.Main;

import java.util.Scanner;

public class OverlappingIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the array size: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] b = new int[n1];
        for (int i = 0; i < n1; i++) {
            b[i] = sc.nextInt();
        }
        boolean val = false;
        int i = 1,j = 0;
        while (i < n) {
            if (a[i] < b[j]) {
                val = true;
                break;
            }
            i++;
            j++;
        }
        System.out.print(val);
    }
}