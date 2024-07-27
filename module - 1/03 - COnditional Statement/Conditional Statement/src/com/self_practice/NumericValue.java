package com.self_practice;

import java.util.Scanner;

public class NumericValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerical value: ");
        int numericalValue = sc.nextInt();
        String text = "";

        if (numericalValue == 9 || numericalValue == 10){
            text = "Excellent";
        } else if (numericalValue == 7 || numericalValue == 8){
            text = "Notable";
        } else if (numericalValue == 6){
            text = "Good";
        } else if (numericalValue == 5){
            text = "Approved";
        } else if (numericalValue >= 0 && numericalValue <= 4){
            text = "Fail";
        } else {
            text = "Invalid";
        }
        System.out.println(text);
    }
}