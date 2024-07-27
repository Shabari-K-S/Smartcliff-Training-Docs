package com.hands_on;

import java.util.Scanner;

public class MinimumOneBitOperationstoMakeIntegersZero {
    public static int minimumOneBitOperationMakeIntegerZero(int n) {
        int ans = 0;
        int k = 0;
        int mask = 1;
        while (mask <= n) {
            if ((n & mask) != 0) {
                ans = (1 << (k + 1)) - 1 - ans;
            }
            mask <<= 1;
            k++;
        }
        return ans;
    }

    public static int minimum1OneBitOperationMakeIntegerZero(int n){
        int ans = 0;
        while (n > 0){
            ans^=n;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(minimum1OneBitOperationMakeIntegerZero(num));
    }
}

