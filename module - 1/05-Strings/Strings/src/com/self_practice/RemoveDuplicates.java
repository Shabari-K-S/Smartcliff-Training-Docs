package com.self_practice;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String newStr = "";
        for (char c : str.toCharArray()) {
            if (newStr.indexOf(c) == -1) {
                newStr += c;
            }
        }
        System.out.println(newStr);
    }
}