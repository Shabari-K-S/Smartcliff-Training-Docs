package com.assessment_i;

import java.util.Scanner;

public class LengthOfTheLongestSubstring {
    private static int lengthOfTheLongestSubstring(String str){
        int[] arr = new int[256];
        int i=0, j=0, max = 0;
        while (j < str.length()){
            if (arr[str.charAt(j)] == 0){
                arr[str.charAt(j)] = 1;
                j++;
                max = Math.max(max, j-i);
            } else {
                arr[str.charAt(i)] = 0;
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The length of the longest substring without repeating characters: "+lengthOfTheLongestSubstring(str));
    }
}