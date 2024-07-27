package com.self_practice;

import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int[] frequency = new int[10];
        while (number > 0){
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        for (int i=0;i<10;i++){
            if (frequency[i] > 0){
                System.out.println(
                        i + " occurs "
                                + frequency[i] + " times"
                );
            }
        }
    }
}