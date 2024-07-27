package com.self_practice;

import java.util.Scanner;

public class XOROperationInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and start: ");
        int n = sc.nextInt();
        int start = sc.nextInt();
        System.out.println("The bitwise XOR of all elements of the array: " + xorOperation(n, start));
    }

    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= (start + 2 * i);
        }
        return result;
    }
}