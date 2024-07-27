package com.self_practice;

import java.util.Scanner;

public class CheckSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(checkSubsequence(A, B));
    }

    private static int checkSubsequence(String A, String B) {
        int i = 0, j = 0;
        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == A.length() ? 1 : 0;
    }
}