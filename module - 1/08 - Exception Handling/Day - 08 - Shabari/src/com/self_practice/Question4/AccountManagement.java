package com.self_practice.Question4;

class AccountManagement {
    private double currentBalance = 80_00_000.00;
    private final double _Max_Transaction_Limit = 30_000.00;

    public void checkForDebit(double amount ) throws PayOutOfBoundsException{
        if (amount >= _Max_Transaction_Limit || amount >= currentBalance) {
            throw new PayOutOfBoundsException("Transaction amount exceeds the limit or insufficient balance.");
        }
    }

    public void withdraw(double amount){
        try{
            checkForDebit(amount);
            currentBalance -= amount;
        } catch (PayOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
