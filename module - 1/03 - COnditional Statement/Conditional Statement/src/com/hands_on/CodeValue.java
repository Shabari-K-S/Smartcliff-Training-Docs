package com.hands_on;

import java.util.Scanner;

public class CodeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code: ");
        int code = sc.nextInt();
        if(code == 1){
            System.out.print("Enter the first double value: ");
            double firstValue = sc.nextDouble();
            System.out.print("Enter the second double value: ");
            double secondValue = sc.nextDouble();
            System.out.println(firstValue + secondValue);
        }else if(code == 2){
            System.out.print("Enter the first integer value: ");
            int firstValue = sc.nextInt();
            System.out.print("Enter the second integer value: ");
            int secondValue = sc.nextInt();
            System.out.println(firstValue * secondValue);
        }else if(code == 3){
            System.out.print("Enter the first string: ");
            String firstString = sc.next();
            System.out.print("Enter the second string: ");
            String secondString = sc.next();
            System.out.println(firstString + secondString);
        }
    }
}