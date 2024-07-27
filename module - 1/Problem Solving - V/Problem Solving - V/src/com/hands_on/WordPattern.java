package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> hashMap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(hashMap.containsKey(c)){
                if(!hashMap.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(hashMap.containsValue(word[i])){
                    return false;
                }
                hashMap.put(c, word[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string - 1: ");
        String pattern = sc.nextLine();
        System.out.print("Enter the string - 2: ");
        String s = sc.nextLine();
        System.out.println(wordPattern(pattern, s));
    }
}
