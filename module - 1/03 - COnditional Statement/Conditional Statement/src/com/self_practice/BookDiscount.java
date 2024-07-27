package com.self_practice;

import java.util.Scanner;

public class BookDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book price: ");
        int bookPrice = sc.nextInt();
        int discount = 0;
        if (bookPrice > 500){
            discount = (int) (bookPrice * 0.10);
        } else {
            discount = 500;
        }
        System.out.println("Final bill amount: "+ (bookPrice - discount));
    }
}