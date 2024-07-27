/**
 * 21. A cashier in a shop has currency notes of denominations 10,50
 *     and 100. If the amount to be returned is the input, find the total
 *     number of currency notes of each denomination that the cashier
 *     should give to the customer. Write a program to accomplish the
 *     above task. Assume that the input is in 10’s multiples.
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class CurrencyNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();

        int hundredNotes = amount / 100;
        int fiftyNotes = (amount % 100) / 50;
        int tenNotes = ((amount % 100) % 50) / 10;

        System.out.println(
                "100 Notes: " + hundredNotes + "\n" +
                "50 Notes: " + fiftyNotes + "\n" +
                "10 Notes: " + tenNotes
        );
    }
}