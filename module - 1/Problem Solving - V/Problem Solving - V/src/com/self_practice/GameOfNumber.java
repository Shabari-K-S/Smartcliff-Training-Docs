package com.self_practice;

import java.util.Scanner;

public class GameOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if (n <= 0)
            return;
        for (int i = 1; i <= n; i++) {
            for( int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print((i-1 == 0)? 1 : i-1 + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
