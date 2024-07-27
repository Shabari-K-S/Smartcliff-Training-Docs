package com.hands_on.Question3;

public class MyCalculator {
    long power(int n, int p) throws InvalidInputException {
        if(n < 0 && p < 0) {
            throw new InvalidInputException("n or p should not be negative");
        }
        if(n == 0 && p == 0) {
            throw new InvalidInputException("n and p should not be zero");
        }
        return (long) Math.pow(n, p);
    }
}
