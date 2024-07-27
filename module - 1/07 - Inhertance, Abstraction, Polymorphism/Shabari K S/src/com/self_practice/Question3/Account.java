package com.self_practice.Question3;

class Account {
    String accountNumber;
    String accountName;
    double balance;

    Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance - amount >= 0){
            balance -= amount;
        }
    }

    String getAccountNumber(){
        return accountNumber;
    }

    String getAccountName(){
        return accountName;
    }

    double getBalance(){
        return balance;
    }

    void displayInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

