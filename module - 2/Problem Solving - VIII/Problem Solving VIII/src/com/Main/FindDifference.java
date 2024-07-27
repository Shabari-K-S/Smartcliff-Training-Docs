package com.Main;

import java.util.Scanner;

public class FindDifference {
    public static void findDifference(String f, String s) {
        for (int i = 0; i < f.length(); i++) {
            s = s.replaceFirst(String.valueOf(f.charAt(i)), "");
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String first = sc.nextLine();
        System.out.println("Enter the second String: ");
        String second = sc.nextLine();
        findDifference(first, second);
        sc.close();
    }
}
