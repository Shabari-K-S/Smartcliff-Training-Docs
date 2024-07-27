package com.self_practice.Question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inventory = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter the book quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("Book quantity: " + quantity);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format. Please enter a valid integer.");
            scanner.nextLine(); // Clear the input buffer
        }

        try {
            System.out.print("Enter the book price: ");
            double price = Double.parseDouble(scanner.next());
            System.out.println("Book price: $" + price);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid price format. Please enter a valid decimal number.");
        }

        try {
            System.out.print("Enter the index to update inventory: ");
            int index = scanner.nextInt();
            inventory[index] = 0;
            System.out.println("Inventory updated successfully.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Specified index is out of bounds. Please enter a valid index.");
        }
    }
}
