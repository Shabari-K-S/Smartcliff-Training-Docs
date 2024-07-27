package com.hands_on;

import java.util.Scanner;

public class DiscountOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of items: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the price of each item: ");
        double price = sc.nextDouble();
        double totalExpenses = quantity * price;
        if  (quantity > 1000){
            totalExpenses = totalExpenses - (totalExpenses * 0.1);
        }
        System.out.println(totalExpenses);
    }
}
