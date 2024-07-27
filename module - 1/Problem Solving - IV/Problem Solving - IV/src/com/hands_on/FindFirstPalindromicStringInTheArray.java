package com.hands_on;

import java.util.Scanner;

public class FindFirstPalindromicStringInTheArray {
    public static String findFirstPalindromicStringInTheArray(String[] str) {
        for(String s: str){
            if(checkPalindrome(s)){
                return s;
            }
        }
        return "None of the String is Palindrome";
    }

    public static boolean checkPalindrome(String word){
        StringBuilder rev = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            rev.append(word.charAt(i));
        }
        return word.contentEquals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        String[] str = new String[size];
        for(int i=0;i<size;i++){
            str[i] = sc.next();
        }
        System.out.println("The first palindrome in the array is `"+ findFirstPalindromicStringInTheArray(str)+"`");
    }
}
