package com.Main;

import java.util.Arrays;
import java.util.Scanner;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of chocolates: ");
        int[] chocolates = new int[size];
        for (int i = 0; i < size; i++) {
            chocolates[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you have: ");
        int amount = sc.nextInt();
        Arrays.sort(chocolates);

        for (int i = 1; i < chocolates.length; i++) {
            if (amount >= (chocolates[i] + chocolates[i-1])) {
                System.out.println(amount - (chocolates[i] + chocolates[i-1]));
            }
        }

    }
}
