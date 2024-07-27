package com.self_practice;

class CashRegister{
    private int cashOnHand;

    public CashRegister(){
        cashOnHand = 100;
    }

    public CashRegister(int cash){
        cashOnHand = cash;
    }

    public int getCurrentBalance(){
        return cashOnHand;
    }

    public void acceptAmount(int amount){
        cashOnHand += amount;
    }
}

public class Question6{
    public static void main(String[] args){
        CashRegister cr = new CashRegister();
        System.out.println("Current Balance: "+cr.getCurrentBalance());
        cr.acceptAmount(100);
        System.out.println("Current Balance: "+cr.getCurrentBalance());
    }
}