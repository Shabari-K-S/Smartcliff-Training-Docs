package com.hands_on;

import java.util.Scanner;

public class RegularExpressionMatching {
    public static boolean regularExpressionMatching(String s, String p) {
        if (p.isEmpty()){
            return s.isEmpty();
        }
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*'){
            return (firstMatch && regularExpressionMatching(s.substring(1), p)) || regularExpressionMatching(s, p.substring(2));
        }else{
            return firstMatch && regularExpressionMatching(s.substring(1), p.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Enter the Pattern: ");
        String p = sc.nextLine();
        System.out.println(regularExpressionMatching(s, p));
    }
}