package com.self_practice.Question3;

class CurrentAccount extends SavingsAccount {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
    }

    double getOverdraftLimit(){
        return overdraftLimit;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
