/**
 * 10. Write a Java program to add 8 to the given number and then
 *     divide it by 3. Now, the modulus of the quotient is taken with 5,
 *     and then multiply the resultant value by 5. Display the result.
 *
 * @author: Shabari K S
 */
package com.hands_on;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = (((number + 3) / 3 ) % 5)*5;
        System.out.println(result);
    }
}
