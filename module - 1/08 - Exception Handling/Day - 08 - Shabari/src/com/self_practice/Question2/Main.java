package com.self_practice.Question2;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100);

        try {
            account.withdraw(150);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
