package com.hands_on;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(String word: words){
            StringBuilder sb = new StringBuilder();
            for(char c: word.toCharArray()){
                sb.append(morse[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the words: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        System.out.println("The number of different transformations: " + uniqueMorseRepresentations(arr));
    }
}