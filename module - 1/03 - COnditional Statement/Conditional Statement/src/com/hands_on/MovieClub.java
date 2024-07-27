package com.hands_on;

import java.util.Scanner;

public class MovieClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age < 0){
            System.out.println("Invalid Age");
        } else if (age <= 10) {
            System.out.println("Teen Club");
        } else if(age < 20){
            System.out.println("Cartoon Club");
        }else{
            System.out.println("Not Allowed");
        }
    }
}