package com.hands_on;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String reverseString = "";
        for (int i = words.length-1; i >= 0; i--){
            reverseString += words[i] + " ";
        }
        System.out.println("The reverse string is `"+reverseString.trim()+"`");
    }
}