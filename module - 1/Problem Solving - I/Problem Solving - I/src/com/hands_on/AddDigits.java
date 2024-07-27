package com.hands_on;

import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int num) {
        int sum;
        if (num < 10) {
            return num;
        } else {
            sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            return addDigits(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(addDigits(userInput));

    }
}
