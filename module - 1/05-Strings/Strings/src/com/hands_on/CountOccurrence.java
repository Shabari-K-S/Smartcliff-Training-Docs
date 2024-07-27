package com.hands_on;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the search text: ");
        String searchText = sc.nextLine();
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words){
            if (word.equals(searchText)){
                count++;
            }
        }
        System.out.println("The occurrence of the search text: " + count);
    }
}