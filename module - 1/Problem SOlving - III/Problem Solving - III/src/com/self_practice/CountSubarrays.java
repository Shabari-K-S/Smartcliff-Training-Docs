package com.self_practice;

import java.util.Scanner;

public class CountSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("L: ");
        int L = sc.nextInt();
        System.out.print("R: ");
        int R = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum >= L && sum <= R) {
                    count++;
                }
            }
        }
        System.out.print("Output :");
        System.out.println(count);
    }
}