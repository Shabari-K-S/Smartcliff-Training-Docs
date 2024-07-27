package com.hands_on;

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static char nonRepeatingCharacter(String str) {
        for(int i = 0; i<str.length(); i++){
            int cnt = 0;
            for(int j = i+1; j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) {
                    cnt++;
                }
            }
            if (cnt <= 0){
                return str.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        System.out.println("The first non-repeating charater is "+ nonRepeatingCharacter(str));
    }
}
