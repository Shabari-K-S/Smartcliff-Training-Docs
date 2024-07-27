/**
 *  2 -> 0000000000000000000000000000010
 *    -> 0100000000000000000000000000000 -> decimal
 *
 *  3 -> 0000000000000000000000000000011
 *    -> 1100000000000000000000000000000 -> decimal
 *
 */

package com.hands_on;

import java.util.Scanner;

public class ReverseBits {
    public static long reverseBits(long A) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            if ((A & (1 << i)) != 0) {
                rev |= 1;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        long num = sc.nextLong();
        System.out.println("The reversed number is "+ reverseBits(num));
    }
}