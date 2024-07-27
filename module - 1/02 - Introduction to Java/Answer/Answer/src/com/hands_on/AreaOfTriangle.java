/**
 * 11. Write a Java program to accept 3 sides of triangle from user and
 *     print area of triangle as an output. (Library method can be used
 *     to find the square root)
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double semiPerimeter = (double) (a + b + c) / 2;
        double areaOfTriangle = Math.sqrt(
                                    semiPerimeter * (semiPerimeter - a)
                                    * (semiPerimeter - b) * (semiPerimeter - c)
                                );
        System.out.println("Area of Triangle : "+areaOfTriangle);
    }
}
