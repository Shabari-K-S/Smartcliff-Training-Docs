package com.hands_on;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        if(userInput == 0) {
            System.out.println("Zero");
        } else if (userInput > 0) {
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }
    }
}
