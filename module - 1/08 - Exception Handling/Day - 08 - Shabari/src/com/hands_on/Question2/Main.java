package com.hands_on.Question2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.add(10, 20);
            calculator.sub(20, 10);
            calculator.multiply(0, 5);
            calculator.divide(10, 0);
        } catch (InvalidDivisionException | InvalidMultiplicationException e) {
            System.out.println(e.getMessage());
        }
    }
}
