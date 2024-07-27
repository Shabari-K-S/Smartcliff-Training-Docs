package com.self_practice;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        String grade = "";
        if (marks > 90){
            grade = "O";
        } else if (marks >= 81){
            grade = "A";
        } else if (marks >= 71){
            grade = "B";
        } else if (marks >= 61){
            grade = "C";
        } else if (marks >= 50){
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade: "+ grade);
    }
}