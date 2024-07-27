package com.self_practice.Question1;

class SavingsAccount extends BankAccount {
    double minimumBalance;
    void withdraw(double amount){
        if(balance - amount >= minimumBalance){
            balance -= amount;
        }
    }
}

