package com.self_practice;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(arr));
    }

    private static String longestCommonPrefix(String[] arr) {
        String lcp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcp = commonPrefix(lcp, arr[i]);
            if (lcp.equals("")) {
                return "-1";
            }
        }
        return lcp;
    }

    private static String commonPrefix(String s1, String s2) {
        int i = 0;
        while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        return s1.substring(0, i);
    }
}