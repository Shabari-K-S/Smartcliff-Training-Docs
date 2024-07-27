package com.Main;

import java.util.Scanner;

public class SortingSentence {
    public static String[] sortSentence(String[] strArr) {
        String[] arr = new String[strArr.length];
        for (String s : strArr) {
            int num = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
            arr[num - 1] = s.substring(0, s.length() - 1);
        }
        return arr;
    }

    public static void sortSentenceUsingTechnique(String[] strArr) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < strArr.length ; i++) {
            for (String s : strArr) {
                if (s.contains(String.valueOf(i+1))) {
                    res.append(s, 0, s.length() - 1);
                    res.append(" ");
                    break;
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
//        String[] strArr = sortSentence(words);
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.print(strArr[i] + " ");
//        }
        sortSentenceUsingTechnique(words);
    }
}
