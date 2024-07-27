package com.self_practice;

import java.util.Scanner;

public class PlaceOfService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter sex (M or F): ");
        char sex = scanner.next().charAt(0);
        sex = Character.toUpperCase(sex);

        placeOfService(age, sex);

        scanner.close();
    }

    public static void placeOfService(int age, char sex) {
        if (sex == 'F') {
            System.out.println("Urban areas");
        } else if (sex == 'M') {
            if (age >= 20 && age <= 40) {
                System.out.println("Anywhere");
            } else if (age > 40 && age <= 60) {
                System.out.println("Urban areas");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}