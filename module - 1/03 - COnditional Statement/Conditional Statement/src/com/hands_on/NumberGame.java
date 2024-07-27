package com.hands_on;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n; i >= 1; i--){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println(", " + sum);
    }
}
