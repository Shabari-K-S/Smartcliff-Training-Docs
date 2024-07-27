package com.hands_on;

import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int currentNumber = sc.nextInt();
        if(currentNumber % 2 != 0){
            currentNumber = currentNumber * 3 + 1;
        }else{
            currentNumber = currentNumber / 2;
        }
        System.out.println(currentNumber);
    }
}