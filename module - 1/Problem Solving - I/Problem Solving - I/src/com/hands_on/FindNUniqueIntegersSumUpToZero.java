package com.hands_on;

import java.util.Scanner;

public class FindNUniqueIntegersSumUpToZero {
    public static int[] findNUniqueIntegersSumUpToZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
        }
        result[n - 1] = -(n * (n - 1)) / 2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int[] result = findNUniqueIntegersSumUpToZero(userInput);
        System.out.println("The array is: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}