/**
 * 3. Declare a variable ‘age’. Assign a value to ‘age’ and print the
 *    value of age. Choose the correct datatype for age considering
 *    age as a whole number.
 *
 * @author: Shabari K S
 */

package com.hands_on;
import java.util.Scanner;

public class DisplayAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println(age);
    }
}
