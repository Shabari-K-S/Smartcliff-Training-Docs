package com.self_practice;

import java.util.Scanner;

public class ReversingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(reverseVowels(S));
    }

    private static String reverseVowels(String S) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int i = 0, j = S.length() - 1;
        char[] s = S.toCharArray();
        while (i < j) {
            if (isVowel(s[i], vowels) && isVowel(s[j], vowels)) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            } else if (isVowel(s[i], vowels)) {
                j--;
            } else {
                i++;
            }
        }
        return new String(s);
    }

    private static boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}