package com.self_practice.Question3;

class SavingsAccount extends Account{
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest(){
        balance += balance * interestRate;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate);
    }
}
