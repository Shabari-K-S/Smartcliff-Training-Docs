package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class RedistributeCharactersToMakeAllStringsEqual {
    public static boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(String word: words){
            for(char c: word.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        for(int i: map.values()){
            if(i % words.length != 0){
                return false;
            }
        }
        return true;
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

        System.out.println(makeEqual(arr));
    }
}