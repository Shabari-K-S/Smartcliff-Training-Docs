package com.hands_on;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String str) {
        int n = str.length();
        int start = 0;
        int end = 0;
        for(int i=0; i<n; i++){
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end+1);
    }
    public static int expandAroundCenter(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(longestPalindromicSubstring(str));
    }
}