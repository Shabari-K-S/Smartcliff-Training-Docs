/**
 * 2. Determine whether we are in trouble based on the smiling status of two monkeys, aSmile and bSmile. We are in trouble if both monkeys are smiling or if neither of them is smiling. Return true if we are in trouble
 * Input - 1:
 * aSmile = false, bSmile = false
 * Output - 1:
 * true
 *
 * Input - 2:
 * aSmile = true, bSmile = true
 * Output - 2:
 * true
 *
 * Input - 3:
 * aSmile = false, bSmile = true
 * Output - 3:
 * false
 */
package com.self_practice;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean aSmile = scanner.nextBoolean();
        boolean bSmile = scanner.nextBoolean();
        boolean inTrouble = aSmile == bSmile;
        System.out.println(inTrouble);
    }
}