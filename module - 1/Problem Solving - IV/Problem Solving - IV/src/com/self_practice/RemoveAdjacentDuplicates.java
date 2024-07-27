package com.self_practice;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(removeDuplicates(S));
    }

    private static String removeDuplicates(String S) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < S.length()) {
            if (i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) {
                i++;
            } else {
                result.append(S.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}