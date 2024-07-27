package com.hands_on;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for(int i=1; i<=userInput; i++){
            if(i % 2 == 0){
                sumOfEven += i;
            }else{
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd + " " + sumOfEven);
    }
}