package com.hands_on;

import java.util.Scanner;

public class DivisorGame {
    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(divisorGame(userInput));
    }
}