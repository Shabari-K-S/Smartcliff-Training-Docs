package com.hands_on;

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInteger(String str) {
        int res = 0;
        for(int i=0; i<str.length(); i++){
            if (i+1 < str.length() && value(str.charAt(i)) < value(str.charAt(i+1))){
                res -= value(str.charAt(i));
            }else{
                res += value(str.charAt(i));
            }
        }
        return res;
    }
    public static int value(char c){
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Numeral: ");
        String str = sc.nextLine();
        System.out.println(romanToInteger(str));
    }
}