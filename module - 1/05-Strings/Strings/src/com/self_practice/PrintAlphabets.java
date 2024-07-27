package com.self_practice;

import java.util.Scanner;

public class PrintAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String userInput = sc.nextLine();
        System.out.print(printAlphabets(userInput));
    }
    public static String printAlphabets(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }
}
