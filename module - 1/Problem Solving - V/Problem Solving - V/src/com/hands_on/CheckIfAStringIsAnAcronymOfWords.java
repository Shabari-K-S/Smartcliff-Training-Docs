package com.hands_on;

import java.util.Scanner;
import java.util.ArrayList;

public class CheckIfAStringIsAnAcronymOfWords {
    public static boolean isAcronym(String[] words, String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(String word: words){
            list.add(word.charAt(0));
        }
        StringBuilder sb = new StringBuilder();
        for(char c: list){
            sb.append(c);
        }
        return sb.toString().equals(s);
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
        System.out.print("Enter the string: ");
        String s = sc.next();

        System.out.println(isAcronym(arr, s));
    }
}