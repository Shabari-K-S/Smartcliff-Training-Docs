package com.hands_on;

import java.util.Scanner;

public class LongestRepeatingAndNonOverlappingSubstring {
    public static String longestRepeatingAndNonOverlappingSubstring(String str) {
        int n = str.length();
        String res = "";
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (str.charAt(i) == str.charAt(j)){
                    int len = 0;
                    while(j+len < n && str.charAt(i+len) == str.charAt(j+len)){
                        len++;
                    }
                    if (len > res.length()){
                        res = str.substring(i, i+len);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(longestRepeatingAndNonOverlappingSubstring(str));
    }
}