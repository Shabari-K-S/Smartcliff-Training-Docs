package com.self_practice;

import java.util.Scanner;

public class CustomerOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer order: ");
        int customerOrder = sc.nextInt();
        System.out.print("Enter the stock: ");
        int stock = sc.nextInt();
        System.out.print("Enter the credit status (Y/N): ");
        char creditStatus = sc.next().charAt(0);
        creditStatus = Character.toUpperCase(creditStatus);

        if (customerOrder <= stock && creditStatus == 'Y'){
            System.out.println(customerOrder + " supplied");
        } else if (creditStatus == 'N'){
            System.out.println("Cannot supply");
        } else {
            System.out.println(stock + " supplied. Out of stock. Balance will be refunded");
        }
    }
}