package com.hands_on.Question2;

class Calculator {
    void add(int a , int b){
        System.out.println("Addition: "+ (a+b));
    }

    void sub(int a, int b){
        System.out.println("Subtraction: "+ (a-b));
    }

    void multiply(int a, int b) throws InvalidMultiplicationException {
        if(a == 0 || b == 0 || a == 1 || b == 1) {
            throw new InvalidMultiplicationException("Multiplication is not possible");
        }
        System.out.println("Multiplication: " + (a * b));
    }
    void divide(int a, int b) throws InvalidDivisionException {
        if(b == 0) {
            throw new InvalidDivisionException("Division is not by 0.");
        }
        System.out.println("Division: " + (a / b));
    }
}
