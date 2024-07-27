package com.hands_on;

import java.util.Scanner;

public class isEligibleToAttendKinderGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of your child: ");
        int childAge = sc.nextInt();
        if  (childAge >= 4){
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
