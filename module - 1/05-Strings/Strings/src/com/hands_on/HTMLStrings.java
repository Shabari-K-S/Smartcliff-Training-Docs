package com.hands_on;

import java.util.Scanner;

public class HTMLStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();
        String[] words = userInput.split(" ");
        System.out.println("<"+words[0]+">"+words[1]+"</"+words[0]+">");
    }
}
