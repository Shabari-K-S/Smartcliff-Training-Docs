package com.hands_on;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        boolean isPrime = true;
        if(userInput < 2){
            isPrime = false;
        }else{
            for(int i=2; i<=userInput/2; i++){
                if(userInput % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}