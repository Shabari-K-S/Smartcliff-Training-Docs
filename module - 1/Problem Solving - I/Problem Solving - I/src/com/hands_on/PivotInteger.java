package com.hands_on;

import java.util.Scanner;

public class PivotInteger {
    public static int pivotInteger(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int j : nums) {
            rightSum += j;
        }
        for (int num : nums) {
            rightSum -= num;
            if (leftSum == rightSum) {
                return num;
            }
            leftSum += num;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int size = sc.nextInt();
        int[] generatedArray = new int[size];
        for (int i = 0; i < size; i++) {
            generatedArray[i] = i+1;
        }
        System.out.println(pivotInteger(generatedArray));
    }
}