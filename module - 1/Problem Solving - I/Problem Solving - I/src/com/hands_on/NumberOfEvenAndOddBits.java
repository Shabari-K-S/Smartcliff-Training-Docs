
package com.hands_on;

import java.util.Scanner;

public class NumberOfEvenAndOddBits {
    public static int[] numberOfEvenAndOddBits(int n) {
        int even = 0, odd = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (i % 2 == 0 && binary.charAt(i) == '1') {
                even++;
            } else if (i % 2 == 1 && binary.charAt(i) == '1') {
                odd++;
            }
        }
        return new int[]{even, odd};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int[] arr = numberOfEvenAndOddBits(n);
        System.out.println("["+arr[0]+","+arr[1]+"]");
    }
}
