package com.self_practice;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total shopping amount: ");
        int shoppingAmount = sc.nextInt();
        int discountAmount = 0;
        if (shoppingAmount >= 5000){
            discountAmount = (int) (shoppingAmount * 0.25);
        } else if (shoppingAmount >= 1000 && shoppingAmount <= 4999){
            discountAmount = (int) (shoppingAmount * 0.10);
        }
        System.out.println(
                "Final amount to be paid: "+ (shoppingAmount - discountAmount)
        );
    }
}