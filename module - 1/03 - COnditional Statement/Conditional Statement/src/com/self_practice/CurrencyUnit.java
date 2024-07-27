package com.self_practice;

import java.util.Scanner;

public class CurrencyUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctAnswer = "Rupee";
        int attempt = 0;
        boolean isAnswerCorrect = false;

        while (attempt < 3 && !isAnswerCorrect){
            System.out.print("What is the unit of currency in India? ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(correctAnswer)){
                System.out.println("Answer is correct");
                isAnswerCorrect = true;
            } else {
                System.out.println("Try again!");
            }
            attempt++;
        }

        if (!isAnswerCorrect){
            System.out.println("Sorry it is Rupee");
        }
    }
}