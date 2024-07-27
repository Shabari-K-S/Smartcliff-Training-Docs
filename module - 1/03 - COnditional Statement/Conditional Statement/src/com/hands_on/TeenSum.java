package com.hands_on;

import java.util.Scanner;

public class TeenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if  (a >= 13 && a <= 19 || b >= 13 && b <= 19){
            System.out.println(19);
        } else {
            System.out.println(a + b);
        }
    }
}