package com.hands_on;

import java.util.Scanner;

public class BadAppears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        if (word.indexOf("bad") == 0 || word.indexOf("bad") == 1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
