package com.hands_on;

import java.util.Scanner;

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        if(accountNumber > 0){
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        if(!accountHolderName.isEmpty()){
            this.accountHolderName = accountHolderName;
        }
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        if(accountBalance >= 0){
            this.accountBalance = accountBalance;
        }
    }

    public void deposit(double amount){
        accountBalance += amount;
    }

    public void withdraw(double amount){
        if(accountBalance - amount >= 0){
            accountBalance -= amount;
        }
    }

    public void display(){
        System.out.println("---------------------  Account Details  ---------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("------------------------------------------------------------");
    }
}

public class QuestionNo10 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(137);
        b.setAccountHolderName("Shabari");
        b.setAccountBalance(5000);
        b.deposit(1000);
        b.withdraw(2000);
        b.display();
    }
}