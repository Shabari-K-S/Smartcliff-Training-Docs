package com.assessment_i;

import java.util.Scanner;

public class ATMWithdrawalTransactionCalculator {
    private static boolean verifyWithdraw(double wd, double bb){
        if (wd < bb)
            return (wd % 5) == 0;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the withdraw amount: $");
        double withdraw = sc.nextInt();
        System.out.print("Enter the initial bank balance: $");
        double bankBalance = sc.nextInt();
        if (verifyWithdraw(withdraw,bankBalance)){
            System.out.println("Bank charges: 0.50 $US (for the transaction)");
            System.out.println("After the successful withdrawal and bank charge deduction: $"+ (bankBalance - withdraw - 0.50));
        } else {
            System.out.println("The withdraw amount is not divisible by 5");
            System.out.println("Bank Balance: $" + bankBalance);
        }
    }
}
