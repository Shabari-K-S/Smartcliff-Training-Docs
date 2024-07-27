package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c: ransomNote.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ransom note: ");
        String ransomNote = sc.next();
        System.out.print("Enter the magazine: ");
        String magazine = sc.next();

        System.out.println(canConstruct(ransomNote, magazine));
    }
}