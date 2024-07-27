package com.hands_on;

import java.util.Scanner;

public class DecodeXORedPermutation {
    public static int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int encodedTotal = 0;
        for (int i = 1; i < n - 1; i += 2) {
            encodedTotal ^= encoded[i];
        }
        perm[0] = total ^ encodedTotal;
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        return perm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] encoded = new int[n - 1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n - 1; i++) {
            encoded[i] = sc.nextInt();
        }
        int[] perm = decode(encoded);
        System.out.println("The original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(perm[i] + " ");
        }
    }
}