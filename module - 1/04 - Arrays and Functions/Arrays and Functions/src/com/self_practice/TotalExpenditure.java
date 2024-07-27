package com.self_practice;

import java.util.Scanner;

public class TotalExpenditure {
    public static int totalExpenditure(int[] expenses) {
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of expenses: ");
        int n = sc.nextInt();
        System.out.println("Enter the expenses: ");
        int[] expenses = new int[n];
        for (int i = 0; i < n; i++) {
            expenses[i] = sc.nextInt();
        }
        System.out.println(
                "The total expenditure is: "
                        + totalExpenditure(expenses)
        );
    }
}