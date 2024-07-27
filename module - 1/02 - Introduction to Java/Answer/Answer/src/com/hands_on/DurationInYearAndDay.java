/**
 * 16. Write a Java application that takes a duration in minutes as input
 *     and calculates the equivalent duration in years and days
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class DurationInYearAndDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the duration in minutes: ");
        int minutes = scanner.nextInt();
        int days = minutes / 1440;
        int years = days / 365;
        days = days % 365;
        System.out.println("Years: " + years + " Days: " + days);
    }
}