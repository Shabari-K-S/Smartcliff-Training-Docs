package com.hands_on;

import java.util.Scanner;

public class FindTheClosestPalindrome {
    public static String findTheClosestPalindrome(String str) {
        int n = str.length();
        long num = Long.parseLong(str);
        long left = Long.parseLong(str.substring(0, (n+1)/2));
        long res = Long.MAX_VALUE;
        long minDiff = Long.MAX_VALUE;
        for(long i=-1; i<=1; i++){
            long newNum = Long.parseLong(String.valueOf(left+i) + new StringBuilder(String.valueOf(left+i)).reverse().substring(n%2));
            if (newNum == num){
                continue;
            }
            long diff = Math.abs(newNum - num);
            if (diff < minDiff){
                minDiff = diff;
                res = newNum;
            }else if (diff == minDiff){
                res = Math.min(res, newNum);
            }
        }
        return String.valueOf(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(findTheClosestPalindrome(str));
    }
}
