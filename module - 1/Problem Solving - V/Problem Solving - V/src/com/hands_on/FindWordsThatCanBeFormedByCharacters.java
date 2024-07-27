package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class FindWordsThatCanBeFormedByCharacters {
    public static int countCharacters(String[] words, String chars) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: chars.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(String word: words){
            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean flag = true;
            for(char c: word.toCharArray()){
                if(temp.containsKey(c) && temp.get(c) > 0){
                    temp.put(c, temp.get(c)-1);
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                result += word.length();
            }
        }
        return result;
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
        System.out.print("Enter the characters: ");
        String chars = sc.next();

        System.out.println("The sum of lengths of all good strings: " + countCharacters(arr, chars));
    }
}