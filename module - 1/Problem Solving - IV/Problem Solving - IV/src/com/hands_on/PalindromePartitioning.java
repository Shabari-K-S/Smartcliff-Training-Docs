package com.hands_on;

import java.util.Scanner;

public class PalindromePartitioning {
    public static int palindromePartitioning(String str) {
        int n = str.length();
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=0; j<=i; j++){
                if (str.charAt(j) == str.charAt(i) && (j > i-1 || dp[j+1] == 0)){
                    min = Math.min(min, j == 0 ? 0 : dp[j-1] + 1);
                    break;
                }
            }
            dp[i] = min;
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(palindromePartitioning(str));
    }
}