package com.self_practice;

import java.util.Scanner;

public class SwapLastTwoChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(swapLastTwoChars(str));
    }

    public static String swapLastTwoChars(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2)
                    + str.charAt(str.length() - 1) +
                    str.charAt(str.length() - 2);
        }
    }
}