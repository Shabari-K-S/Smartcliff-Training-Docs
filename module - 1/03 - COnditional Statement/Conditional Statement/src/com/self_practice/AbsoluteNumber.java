package com.self_practice;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();

        if (userInput < 0){
            userInput *= -1;
        }
        System.out.println("Absolute number of the given number: "+ userInput);
    }
}
