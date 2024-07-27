/**
 * 13. Suppose the values of variables 'a' and 'b' are 6 and 8
 *     respectively, write programs to swap the values of the two
 *     variables.
 * a. First program by using a third variable
 * @author: Shabari K S
 */

package com.hands_on;
import java.util.Scanner;
public class SwappingUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
