package com.hands_on;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if(
                s.contains("a")|| s.contains("e")
                || s.contains("i") || s.contains("o")
                || s.contains("u") ||s.contains("A")
                || s.contains("E") || s.contains("I")
                || s.contains("O") || s.contains("U")
        ){
            System.out.print(
                    "The replaced string: "
                    +s.replaceAll("[aeiouAEIOU]", "z")
            );
        }else{
            System.out.println("No vowels present");
        }
    }
}