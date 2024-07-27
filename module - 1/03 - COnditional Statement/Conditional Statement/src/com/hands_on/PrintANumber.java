package com.hands_on;

import java.util.Scanner;

public class PrintANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        if(userInput > 20){
            System.out.println("Invalid Input");
            return;
        }
        for(int i = 1; i <= 20; i++ ){
            if (userInput == i){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
