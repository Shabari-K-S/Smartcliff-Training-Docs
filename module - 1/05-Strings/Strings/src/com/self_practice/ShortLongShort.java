package com.self_practice;

import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String a = sc.nextLine();
        System.out.print("Enter the second String: ");
        String b = sc.nextLine();
        System.out.println(shortLongShort(a, b));
    }

    public static String shortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
}