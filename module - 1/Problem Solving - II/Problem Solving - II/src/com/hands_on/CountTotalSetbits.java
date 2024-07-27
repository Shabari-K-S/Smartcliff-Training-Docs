package com.hands_on;

import java.util.Scanner;

public class CountTotalSetbits {
    public static int countSetBits(int n) {
        int bitCount = 0;
        for (int i = 1; i <= n; i++)
            bitCount += countSetBitsUtil(i);
        return bitCount;
    }

    public static int countSetBitsUtil(int x)
    {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1)
                + countSetBitsUtil(x / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("The total setbit count is "+ countSetBits(num));
    }
}
