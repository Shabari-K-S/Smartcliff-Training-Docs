package com.hands_onn;

import java.util.Scanner;

public class DiamondOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n; i+=2) {
            for (int j = 1; j <= 2*n-i; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                if (k >= 10)
                    k=1;
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
        for (int i = 2*n-2; i >= 0; i-=2) {
            for (int j = 1; j <= 2*n-i+1; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j < i; j++) {
                if (k >= 10)
                    k=1;
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}
