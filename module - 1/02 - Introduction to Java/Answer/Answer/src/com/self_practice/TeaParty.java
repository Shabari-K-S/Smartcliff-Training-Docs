/**
 * 5. We're hosting a party with tea and candy. The outcome of the party
 * is encoded as follows: 0=bad, 1=good, or 2=great. A party is considered
 * good (1) if both tea and candy are at least 5. If either tea or candy is
 * at least double the amount of the other one, the party is great (2).
 * However, if either tea or candy is less than 5, the party is always bad (0).
 *
 * Input-1:
 * tea = 6, candy = 8
 * Output-1:
 * 1
 *
 * Input-2:
 * tea = 3, candy = 8
 * Output-2:
 * 0
 *
 * Input-3:
 * tea = 20, candy = 6
 * Output-3:
 * 2
 */
package com.self_practice;

import java.util.Scanner;

public class TeaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tea = scanner.nextInt();
        int candy = scanner.nextInt();
        int result = 0;
        if (tea >= 5 && candy >= 5) {
            result = 1;
            if (tea >= 2 * candy || candy >= 2 * tea) {
                result = 2;
            }
        }
        System.out.println(result);
    }
}