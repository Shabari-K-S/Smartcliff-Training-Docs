package com.self_practice;

import java.util.Scanner;

public class LastSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lastSubstring(s));
    }

    public static String lastSubstring(String s) {
        String maxSubstring = s;
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i).compareTo(maxSubstring) > 0) {
                maxSubstring = s.substring(i);
            }
        }
        return maxSubstring;
    }
}