package com.self_practice;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(numberToWords(N));
        }
    }

    private static String numberToWords(int N) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        String[] thousands = {"", "thousand", "lakh", "crore"};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (N > 0) {
            if (N % 1000 != 0) {
                result.insert(0, thousands[i] + " ");
                result.insert(0, convertToWords(N % 1000, units, tens, hundreds));
            }
            N /= 1000;
            i++;
        }
        return result.toString().trim();
    }
    private static String convertToWords(int N, String[] units, String[] tens, String[] hundreds) {
        StringBuilder result = new StringBuilder();
        if (N >= 100) {
            result.append(hundreds[N / 100]).append(" ");
            N %= 100;
        }
        if (N >= 20) {
            result.append(tens[N / 10]).append(" ");
            N %= 10;
        }
        if (N > 0) {
            result.append(units[N]).append(" ");
        }
        return result.toString();
    }
}