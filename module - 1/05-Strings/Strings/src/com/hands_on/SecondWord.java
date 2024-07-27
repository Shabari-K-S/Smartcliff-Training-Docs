package com.hands_on;

import java.util.Scanner;

public class SecondWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        if (words.length >= 2){
            System.out.println(words[1].toUpperCase());
        }else{
            System.out.println("LESS");
        }
    }
}