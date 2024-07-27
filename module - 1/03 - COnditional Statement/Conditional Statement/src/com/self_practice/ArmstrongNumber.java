package com.self_practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println(temp == sum);
    }
}