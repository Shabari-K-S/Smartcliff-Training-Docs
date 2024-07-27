package com.handson;

import java.util.Scanner;

public class StringSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        StringBuilder letters = new StringBuilder();
        int digitSum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitSum += Character.getNumericValue(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            }
        }
        char[] letterArray = letters.toString().toCharArray();
        
        bubbleSort(letterArray);
        StringBuilder sortedLetters = new StringBuilder();
        for (char ch : letterArray) {
            sortedLetters.append(ch);
        }

        if (digitSum > 0) {
            sortedLetters.append(digitSum);
        }
        System.out.print(sortedLetters.toString());
	}
        public static void bubbleSort(char[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        char temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

}
