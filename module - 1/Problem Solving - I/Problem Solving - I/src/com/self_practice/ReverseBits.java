package com.self_practice;

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        System.out.println("The reversed bits of the number: " + reverseBits(x));
    }

    public static int reverseBits(int x) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (x & 1);
            x >>= 1;
        }
        return reversed;
    }
}