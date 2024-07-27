package com.self_practice;

import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secret = sc.next();
        String guess = sc.next();
        System.out.println(getHint(secret, guess));
    }

    private static String getHint(String secret, String guess) {
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                secretCount[secret.charAt(i) - '0']++;
                guessCount[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretCount[i], guessCount[i]);
        }
        return bulls + "A" + cows + "B";
    }
}