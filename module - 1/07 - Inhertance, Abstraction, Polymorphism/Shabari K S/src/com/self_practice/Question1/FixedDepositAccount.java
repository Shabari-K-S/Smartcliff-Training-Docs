package com.self_practice.Question1;

class FixedDepositAccount extends SavingsAccount {
    int term;
    double getInterest(){
        return balance * interestRate * term;
    }
}
