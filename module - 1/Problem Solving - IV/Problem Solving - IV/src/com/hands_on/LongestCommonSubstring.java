package com.hands_on;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static int  longestCommonSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        int res = 0;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if (i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    res = Math.max(res, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return res;
    }

    public static int longestCommonSubstring1(String str1, String str2){
        int k=0, cnt=0,max=0;
        for(int i=0;i<str1.length();i++){
            k =i;
            for(int j=0;j<str2.length();j++){
                if (str1.charAt(k) == str2.charAt(j)){
                    cnt++;
                }
            }
            if (cnt > max)
                max = cnt;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String - 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String - 2: ");
        String str2 = sc.nextLine();
        System.out.println(longestCommonSubstring1(str1,str2));
    }
}