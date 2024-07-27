/**
 * 8. If the selling price of 15 items and total profit earned on them is input through the keyboard, write a program to find the cost price of one item.
 * Input:
 * sellingPrice = 60, profit = 30
 * Output:
 * 2
 *
 * Input:
 * sellingPrice = 225, profit = 45
 * Output:
 * 12
 */

package com.self_practice;

import java.util.Scanner;

public class CostPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sellingPrice = scanner.nextInt();
        int profit = scanner.nextInt();
        int costPrice = (sellingPrice - profit) / 15;
        System.out.println(costPrice);
    }
}