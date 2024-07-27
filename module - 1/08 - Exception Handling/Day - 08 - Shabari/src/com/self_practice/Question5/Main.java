package com.self_practice.Question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Part Number: ");
            int partNumber = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer
            System.out.print("Enter Part Description: ");
            String partDescription = scanner.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Price Per Item: ");
            double pricePerItem = scanner.nextDouble();

            if (partNumber <= 0 || partDescription.isEmpty() || quantity <= 0 || pricePerItem <= 0) {
                throw new InputMismatchException("Invalid input. Please enter valid values.");
            }

            Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
            invoice.displayInvoice();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format. Please enter valid values.");
        }
    }
}