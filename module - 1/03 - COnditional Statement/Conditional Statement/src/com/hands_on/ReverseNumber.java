package com.hands_on;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if(number < 10000 || number > 99999){
            System.out.println("Not a valid number");
        }else{
            int reverse = 0;
            while(number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }
            System.out.println(reverse);
        }
    }
}