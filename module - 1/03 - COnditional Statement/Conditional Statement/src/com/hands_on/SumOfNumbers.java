package com.hands_on;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of input: ");
        int range = sc.nextInt();
        System.out.print("Enter "+ range + " numbers: ");
        int sum = 0;
        for(int i=0; i<range; i++){
            sum += sc.nextInt();
        }
        System.out.println("Sum of given number: "+ sum);
    }
}
