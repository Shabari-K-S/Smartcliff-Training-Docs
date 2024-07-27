package com.hands_on;

import java.util.Scanner;

public class MinimumDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        System.out.print("Enter the first word: ");
        String word1 = sc.next();
        System.out.print("Enter the second word: ");
        String word2 = sc.next();
        int index1 = -1, index2 = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if (words[i].equals(word1)){
                index1 = i;
            }
            if (words[i].equals(word2)){
                index2 = i;
            }
            if (index1 != -1 && index2 != -1){
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }
        System.out.println("Minimum distance between the words "+word1+" and "+word2+" is "+minDistance);
    }
}