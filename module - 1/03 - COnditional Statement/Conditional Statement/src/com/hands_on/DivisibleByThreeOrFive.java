package com.hands_on;

import java.util.Scanner;

public class DivisibleByThreeOrFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        for (int i=1; i<=userInput; i++){
            if (i % 3 == 0 ){
                System.out.print(i + " ");
            } else if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
