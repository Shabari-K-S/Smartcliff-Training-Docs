package com.self_practice.Question3;

public class Main {
    public static void main(String[] args) {
        Account a = new Account("123456", 1000);
        a.deposit(500);
        a.withdraw(200);
        a.displayInfo();
        SavingsAccount s = new SavingsAccount("123457", 2000, 0.05);
        s.deposit(500);
        s.withdraw(300);
        s.addInterest();
        s.displayInfo();
        CurrentAccount c = new CurrentAccount("123458", 3000, 500);
        c.deposit(1000);
        c.withdraw(4000);
        c.displayInfo();
    }
}
