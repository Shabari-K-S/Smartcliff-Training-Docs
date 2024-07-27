package com.hands_on;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=userInput;i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+ userInput+" is "+ factorial);
    }
}
