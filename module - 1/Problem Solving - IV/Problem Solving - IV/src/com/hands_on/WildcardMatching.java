package com.hands_on;

import java.util.Scanner;

public class WildcardMatching {
    public static boolean wildcardMatching(String s, String p) {
        if (p.isEmpty()){
            return s.isEmpty();
        }
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?');
        if (p.length() >= 2 && p.charAt(1) == '*'){
            return wildcardMatching(s, p.substring(2)) || (firstMatch && wildcardMatching(s.substring(1), p));
        }else{
            return firstMatch && wildcardMatching(s.substring(1), p.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Enter the Pattern: ");
        String p = sc.nextLine();
        System.out.println(wildcardMatching(s, p));
    }
}