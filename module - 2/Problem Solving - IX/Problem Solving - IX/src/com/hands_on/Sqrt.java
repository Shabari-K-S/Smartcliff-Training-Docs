package com.hands_on;

public class Sqrt {
    public static double sqrt(int x) {
        if (x == 0) return 0;

        double guess = (double) x / 2;
        double prevGuess;

        do {
            prevGuess = guess;
            guess = (guess + x / guess) / 2;
        } while (Math.abs(guess - prevGuess) > 0.0001);

        return guess;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println((int)sqrt(n));;
    }
}
