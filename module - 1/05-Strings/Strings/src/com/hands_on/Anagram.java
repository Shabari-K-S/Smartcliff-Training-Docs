package com.hands_on;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = sc.nextLine();
        System.out.print("Enter the second string: ");
        String b = sc.nextLine();
        if (isAnagram(a, b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}