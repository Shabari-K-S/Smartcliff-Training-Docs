package com.hands_on;

import java.util.Scanner;

public class IsomorphicStrings {
    public static boolean isomorphicStrings(String str1, String str2) {
        if (str1.length() != str2.length()){
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for(int i=0; i<str1.length(); i++){
            if (freq1[str1.charAt(i)] != freq2[str2.charAt(i)]){
                return false;
            }
            freq1[str1.charAt(i)] = i+1;
            freq2[str2.charAt(i)] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String - 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String - 2: ");
        String str2 = sc.nextLine();
        System.out.println(isomorphicStrings(str1,str2));
    }
}