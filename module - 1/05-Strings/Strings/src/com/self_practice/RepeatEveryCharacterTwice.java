package com.self_practice;

import java.util.Scanner;

public class RepeatEveryCharacterTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}