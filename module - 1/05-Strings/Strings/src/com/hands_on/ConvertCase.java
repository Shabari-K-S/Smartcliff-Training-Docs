package com.hands_on;

import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        System.out.print("Enter the word: ");
        String word = sc.next();
        String convertedString = "";
        for (String w : words){
            if (w.equalsIgnoreCase(word)){
                for (char c : w.toCharArray()){
                    if (Character.isLowerCase(c)){
                        convertedString += Character.toUpperCase(c);
                    }else{
                        convertedString += Character.toLowerCase(c);
                    }
                }
            }else{
                convertedString += w;
            }
            convertedString += " ";
        }
        System.out.println(convertedString.trim());
    }
}