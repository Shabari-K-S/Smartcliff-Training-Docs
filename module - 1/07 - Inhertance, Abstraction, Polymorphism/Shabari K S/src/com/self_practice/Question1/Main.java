package com.self_practice.Question1;

public class Main{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.accountNumber = 123456;
        b.balance = 1000;
        b.interestRate = 0.05;
        b.deposit(500);
        System.out.println("Balance: " + b.balance);

        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 123456;
        s.balance = 1000;
        s.interestRate = 0.05;
        s.minimumBalance = 500;
        s.withdraw(500);
        System.out.println("Balance: " + s.balance);

        FixedDepositAccount f = new FixedDepositAccount();
        f.accountNumber = 123456;
        f.balance = 1000;
        f.interestRate = 0.05;
        f.minimumBalance = 500;
        f.term = 5;
        System.out.println("Interest: " + f.getInterest());
    }
}
