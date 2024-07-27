package com.self_practice;

import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(intToRoman(A));
    }

    private static String intToRoman(int A) {
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder result = new StringBuilder();
        for (int i = values.length - 1; i >= 0; i--) {
            while (A >= values[i]) {
                result.append(roman[i]);
                A -= values[i];
            }
        }
        return result.toString();
    }
}