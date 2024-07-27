package com.hands_on;

import java.util.Scanner;

public class MagicalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for ( int i = 1 ; i < 2*n; i++) {
            for (int j = 1; j < 2 * n; j++)
                System.out.print(n - Math.max(Math.min(i, 2 * n - i), Math.min(j, 2 * n - j)) + 1 + " ");
            System.out.println();
        }
    }
}
