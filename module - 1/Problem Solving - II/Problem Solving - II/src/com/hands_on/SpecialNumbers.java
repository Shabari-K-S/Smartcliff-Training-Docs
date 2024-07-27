package com.hands_on;

import java.util.Scanner;

public class SpecialNumbers {
    public static int findSpecialNumber(int N) {
        int count = 0, i = 0;
        while (count < N) {
            String num = String.valueOf(i);
            boolean isSpecial = true;
            for (char c : num.toCharArray()) {
                if (c > '5') {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                count++;
            }
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println(findSpecialNumber(n));
    }
}