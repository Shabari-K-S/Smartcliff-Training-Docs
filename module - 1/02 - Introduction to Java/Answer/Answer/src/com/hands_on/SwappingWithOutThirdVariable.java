/**
 * 13. Suppose the values of variables 'a' and 'b' are 6 and 8
 *     respectively, write programs to swap the values of the two
 *     variables.
 * b. Second program without using any third variable (use arithmetic operators)
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class SwappingWithOutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
