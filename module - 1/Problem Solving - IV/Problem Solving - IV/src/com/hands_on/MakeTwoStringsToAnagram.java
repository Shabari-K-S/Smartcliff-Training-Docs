package com.hands_on;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class MakeTwoStringsToAnagram {
    public static int makeTwoStringsToAnagram(String str1, String str2) {
        int cnt = Math.max(str1.length(), str2.length());
        if (str1.length() > str2.length()){
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }
        for(char c1: str1.toCharArray()){
            for(char c2: str2.toCharArray()){
                if (c1 == c2){
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String - 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String - 2: ");
        String str2 = sc.nextLine();
        System.out.println(makeTwoStringsToAnagram(str1,str2));
    }
}
