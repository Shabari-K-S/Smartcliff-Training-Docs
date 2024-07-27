package com.hands_on;

import java.util.Scanner;

public class SeriesOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        for(int i=2; i<=userInput; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}