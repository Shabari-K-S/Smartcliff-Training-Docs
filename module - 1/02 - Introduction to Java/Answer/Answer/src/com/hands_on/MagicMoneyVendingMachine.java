/**
 * 20. Anisha and Raja took their common pocket money to the market.
 *     Anisha bought Apples and Raju bought Bananas. On their way
 *     back they saw a Magic Money Vending Machine which gives the
 *     triple of the money deposited. They both tried with all the balance
 *     amount that they had. Now write a program to,
 *         1. Print the amount, they spent together in the market
 *         2. Print the final amount that they had when they reach home
 *         3. Print the amount they deposited in the magic machine
 *     Inputs: Pocket money, Apple cost, Banana cost
 *
 * @author : Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class MagicMoneyVendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pocket Money: ");
        double pocketMoney = scanner.nextDouble();
        System.out.println("Enter the Apple cost: ");
        double appleCost = scanner.nextDouble();
        System.out.println("Enter the Banana cost: ");
        double bananaCost = scanner.nextDouble();

        double amountSpent = appleCost + bananaCost;
        double finalAmount = pocketMoney - amountSpent;
        double depositAmount = finalAmount * 3;

        System.out.println("Amount spent in the market: " + amountSpent);
        System.out.println("Final amount when they reach home: " + finalAmount);
        System.out.println("Amount deposited in the magic machine: " + depositAmount);
    }
}