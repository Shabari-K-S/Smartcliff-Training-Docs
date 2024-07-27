package com.self_practice;

import java.util.Scanner;

public class RemainingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char ch = sc.next().charAt(0);
        int count = sc.nextInt();
        System.out.println(remainingString(S, ch, count));
    }

    private static String remainingString(String S, char ch, int count) {
        int index = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ch) {
                count--;
                if (count == 0) {
                    index = i;
                    break;
                }
            }
        }
        if (index == -1) {
            return "";
        }
        return S.substring(index + 1);
    }
}