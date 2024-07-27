package com.hands_on;

import java.util.Scanner;

public class IPL2021Final {
    public static int ipl2021Final(String str) {
        int n = str.length();
        int[] dp = new int[n];
        int res = 0;
        for(int i=1; i<n; i++){
            if (str.charAt(i) == ')'){
                if (str.charAt(i-1) == '('){
                    dp[i] = (i >= 2 ? dp[i-2] : 0) + 2;
                }else if (
                        i - dp[i-1] > 0
                                && str.charAt(i - dp[i-1] - 1) == '('
                ){
                    dp[i] = dp[i-1] + ((i - dp[i-1]) >= 2
                            ? dp[i - dp[i-1] - 2] : 0) + 2;
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(ipl2021Final(str));
    }
}
