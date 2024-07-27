/**
 * 4. Declare three integer variables named 'hundred', 'twoHundred',
 *    and 'threeHundred', and initialize them with the values 10, 2000,
 *    and -30000 respectively. Then, reassign them with the
 *    corresponding number names. Finally, print the values of all three
 *    variables.
 *
 * @author: Shabari K S
 */

package com.hands_on;
import java.util.Scanner;

public class GetThreeUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short hundred = 10, twoHundred = 2000, threeHundred = -30000;
        hundred = scanner.nextShort();
        twoHundred = scanner.nextShort();
        threeHundred = scanner.nextShort();
        System.out.println(hundred+"\n"+twoHundred+"\n"+threeHundred);
    }
}
