/**
 * 12. A factory-manufactured LED bulbs on the first day. On the second
 *     day, it made CFL bulbs. How many bulbs did the factory make
 *     altogether? Counts are the input
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class CountLEDAndCFLBulb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOne = scanner.nextInt();
        int dayTwo = scanner.nextInt();
        System.out.println(dayOne+dayTwo);
    }
}
