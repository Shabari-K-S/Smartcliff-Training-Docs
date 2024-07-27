package com.self_practice;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int sum = 0;
        int count = 1;

        for (int i = 1; i <= N; i++){
            sum += count;
            count += 2;
        }
        System.out.println("Sum of first "+ N +" odd numbers: "+ sum);
    }
}