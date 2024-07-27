package com.self_practice;

import java.util.Scanner;

public class CakeDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] sweetness = new int[n];
        System.out.print("Enter the sweetness array: ");
        for(int i = 0; i < n; i++) {
            sweetness[i] = sc.nextInt();
        }
        System.out.print("K: ");
        int k = sc.nextInt();
        System.out.print("Output :");
        System.out.println(cakeDistribution(sweetness, k));
    }

    public static int cakeDistribution(int[] sweetness, int k) {
        int n = sweetness.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sweetness[i];
        }
        int start = 0;
        int end = sum;
        int max = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                temp += sweetness[i];
                if (temp >= mid) {
                    count++;
                    temp = 0;
                }
            }
            if (count >= k + 1) {
                max = Math.max(max, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return max;
    }
}