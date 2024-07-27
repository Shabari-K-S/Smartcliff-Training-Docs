package com.self_practice;

import java.util.Scanner;

public class GradeFrequency {
    static int frequencyOfNumber(int[] arr, int num){
        int frequency = 0;
        for (int j : arr) {
            if (j == num) {
                frequency += 1;
            }
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to check frequency: ");
        int frequencyNumber = sc.nextInt();
        System.out.println(frequencyOfNumber(array, frequencyNumber));
    }
}
