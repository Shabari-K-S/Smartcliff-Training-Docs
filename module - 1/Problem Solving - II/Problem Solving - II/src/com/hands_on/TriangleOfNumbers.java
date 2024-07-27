package com.hands_on;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void triangleOfNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
            }
            k -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(k--);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        triangleOfNumbers(n);
    }
}