package com.hands_on;

import java.util.Arrays;
import java.util.Scanner;

public class OddOrEvenSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int value=0;
        if (userInput % 2 == 0){
            value=2;
        }else{
            value=1;
        }
        for(int i=value; i<=userInput; i+=2){
            System.out.print(i + " ");
        }
    }
}
