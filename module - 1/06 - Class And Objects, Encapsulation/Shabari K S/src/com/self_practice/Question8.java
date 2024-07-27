package com.self_practice;

class InterestCalculator{
    public static double calculateCompoundInterest(double principal, double rate, int years){
        return principal * Math.pow(1 + rate/100, years);
    }

    public static double calculateInterestOnly(double principal, double rate, int years){
        return principal * (Math.pow(1 + rate/100, years) - 1);
    }
}

public class Question8{
    public static void main(String[] args){
        System.out.println("Total Amount: "+InterestCalculator.calculateCompoundInterest(1000, 5, 2));
        System.out.println("Compound Interest: "+InterestCalculator.calculateInterestOnly(1000, 5, 2));
    }
}