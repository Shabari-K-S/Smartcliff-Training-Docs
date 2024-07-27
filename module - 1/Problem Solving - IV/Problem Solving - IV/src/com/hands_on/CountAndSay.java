package com.hands_on;

import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        String str = "1";
        for(int i=2; i<=n; i++){
            str = helper(str);
        }
        return str;
    }
    public static String helper(String str){
        StringBuilder res = new StringBuilder();
        int count = 1;
        for(int i=0; i<str.length(); i++){
            if (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                res.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }
}