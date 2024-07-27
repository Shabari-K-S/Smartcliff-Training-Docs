package com.self_practice;

import java.util.Scanner;

public class MaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("M: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        System.out.print("Output :");
        System.out.println(maximumScore(A, B));
    }

    public static int maximumScore(int[] A, int[] B) {
        int mod = 1000000007;
        int i = 0, j = 0;
        long sum = 0, result = 0;
        while(i < A.length && j < B.length) {
            if(A[i] < B[j]) {
                sum += A[i];
                i++;
            } else if(A[i] > B[j]) {
                sum += B[j];
                j++;
            } else {
                sum += A[i];
                result = (result + sum) % mod;
                sum = 0;
                i++;
                j++;
            }
        }
        while(i < A.length) {
            sum += A[i];
            i++;
        }
        while(j < B.length) {
            sum += B[j];
            j++;
        }
        result = (result + sum) % mod;
        return (int) result;
    }
}