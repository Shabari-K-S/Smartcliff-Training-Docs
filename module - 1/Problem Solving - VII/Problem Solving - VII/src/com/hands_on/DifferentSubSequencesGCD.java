package com.hands_on;

import java.util.*;

public class DifferentSubSequencesGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The count of `Different Subsequence GCD` of the given array is "+gcdSubsequences(arr));
        }
    }

    public static int gcdSubsequences(int[] arr) {
        int cnt = 0;
        HashMap<Integer, Integer> factorToGcd = new HashMap<>();
        for (int num : arr) {
            for (int i = 1; i * i <= num; i++) {
                if (num % i != 0) continue;
                int i2 = num / i;
                int gcd1 = gcd(factorToGcd.getOrDefault(i, num), num);
                int gcd2 = gcd(factorToGcd.getOrDefault(i2, num), num);
                factorToGcd.put(i, gcd1);
                factorToGcd.put(i2, gcd2);
            }
        }
        for (int f : factorToGcd.keySet()) {
            if (factorToGcd.get(f) == f) cnt++;
        }
        return cnt;
    }


    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}