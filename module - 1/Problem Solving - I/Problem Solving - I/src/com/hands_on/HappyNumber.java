package com.hands_on;

import java.util.Scanner;

public class HappyNumber {
    public static int happyNumber(int num) {
        int sum;
        if (num < 10) {
            if (num == 1){
                return 1;
            }else{
                return 0;
            }
        } else {
            sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            return happyNumber(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println((happyNumber(userInput) == 1));

    }
}
