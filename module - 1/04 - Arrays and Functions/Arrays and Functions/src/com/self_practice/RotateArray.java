package com.self_practice;

import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int[] numbers, int rotate) {
        int n = numbers.length;
        for (int i = 0; i < rotate; i++) {
            int temp = numbers[0];
            for (int j = 0; j < n - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[n - 1] = temp;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number of steps to rotate: ");
        int rotate = sc.nextInt();
        rotateArray(numbers, rotate);
    }
}