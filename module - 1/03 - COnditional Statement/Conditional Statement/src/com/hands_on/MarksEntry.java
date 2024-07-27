package com.hands_on;

import java.util.Scanner;

public class MarksEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if  (marks >= 0 && marks <= 100){
            System.out.println("Valid entry");
        } else {
            System.out.println("Invalid entry");
        }
    }
}