package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();

        System.out.println("The index of the first non-repeating character: " + firstUniqChar(s));
    }
}