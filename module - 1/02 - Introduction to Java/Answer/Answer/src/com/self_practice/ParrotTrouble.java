/**
 * 4. We have a loud-talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Print true if we are in trouble.
 * Input-1:
 * hour = 6, talking = true
 * Output-1:
 * true
 *
 * Input-2:
 * hour = 7, talking = true
 * Output-2:
 * false
 *
 * Input-3:
 * hour = 6, talking = false
 * Output-3:
 * false
 */
package com.self_practice;

import java.util.Scanner;

public class ParrotTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        boolean talking = scanner.nextBoolean();
        boolean inTrouble = talking && (hour < 7 || hour > 20);
        System.out.println(inTrouble);
    }
}