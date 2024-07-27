package com.hands_on;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = sc.nextLine();
        if (firstString.charAt(firstString.length()-1) == secondString.charAt(0)){
            System.out.println("The Concatenated String: "+firstString+secondString.substring(1));
        }else{
            System.out.println("The Concatenated String: "+firstString+secondString);
        }
    }
}