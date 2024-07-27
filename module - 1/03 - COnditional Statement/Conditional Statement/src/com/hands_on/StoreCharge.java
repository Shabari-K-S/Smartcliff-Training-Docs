package com.hands_on;

import java.util.Scanner;

public class StoreCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter the count of items: ");
        int countOfItem = sc.nextInt();

        System.out.println("Name: "+ customerName);
        if (countOfItem < 10) {
            System.out.println("Price: "+ (countOfItem*12));
        } else if (countOfItem < 99) {
            System.out.println("Price: "+ (countOfItem*10));
        } else if (countOfItem > 100) {
            System.out.println("Price: "+ (countOfItem*7));

        }
    }
}
