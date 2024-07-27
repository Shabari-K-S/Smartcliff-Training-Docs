package com.self_practice;

import java.util.Scanner;

public class MinimumLamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            System.out.println(minimumLamps(S));
        }
    }

    private static int minimumLamps(String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                if (i + 1 < S.length() && S.charAt(i + 1) == '.') {
                    count++;
                    i++;
                }
            }
        }
        return count;
    }
}