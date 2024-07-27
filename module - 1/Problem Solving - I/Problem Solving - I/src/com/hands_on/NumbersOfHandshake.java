package com.hands_on;

import java.util.Scanner;

public class NumbersOfHandshake {
    public static int numberOfHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(
                "Possible number of handshakes: "
                        +numberOfHandshakes(userInput)
        );
    }
}