package com.hands_on;

import java.util.Scanner;

public class ValidNumber {
    public static boolean validNumber(String str) {
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                numSeen = true;
            }else if (ch == '.'){
                if (dotSeen || eSeen){
                    return false;
                }
                dotSeen = true;
            }else if (ch == 'e' || ch == 'E'){
                if (eSeen || !numSeen){
                    return false;
                }
                eSeen = true;
                numSeen = false;
            }else if (ch == '+' || ch == '-'){
                if (i > 0 && str.charAt(i-1) != 'e' && str.charAt(i-1) != 'E'){
                    return false;
                }
            }else{
                return false;
            }
        }
        return numSeen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(validNumber(str));
    }
}