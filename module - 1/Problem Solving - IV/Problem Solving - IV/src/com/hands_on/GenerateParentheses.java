package com.hands_on;

import java.util.Scanner;

public class GenerateParentheses {
    public static void generateParentheses(int n) {
        helper(n, n, "");
    }
    public static void helper(int open, int close, String str){
        if (open == 0 && close == 0){
            System.out.println(str);
            return;
        }
        if (open > 0){
            helper(open-1, close, str+"{");
        }
        if (close > open){
            helper(open, close-1, str+"}");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Pairs: ");
        int n = sc.nextInt();
        generateParentheses(n);
    }
}