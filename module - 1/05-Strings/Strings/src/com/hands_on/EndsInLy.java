package com.hands_on;

import java.util.Scanner;

public class EndsInLy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String userInput = sc.nextLine();
        if (userInput.endsWith("ly")) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
