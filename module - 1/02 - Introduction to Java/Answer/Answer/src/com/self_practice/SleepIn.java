/**
 * 1. Determine whether to sleep in based on two conditions: weekday and vacation. If it's not a weekday or if we're on vacation, we sleep in. Write Java code to determine whether we sleep in or not.
 * Input - 1:
 * weekday = false, vacation = false
 * Output - 1:
 * true
 *
 * Input - 2:
 * weekday = true, vacation = false
 * Output - 2:
 * false
 *
 * Input - 3:
 * weekday = false, vacation = true
 * Output - 3:
 * true
 */

package com.self_practice;

import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weekday = scanner.nextBoolean();
        boolean vacation = scanner.nextBoolean();
        boolean sleepIn = !weekday || vacation;
        System.out.println(sleepIn);
    }
}