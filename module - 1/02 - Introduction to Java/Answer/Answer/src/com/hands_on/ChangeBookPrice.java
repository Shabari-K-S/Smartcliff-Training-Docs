/**
 * 5.Declare a variable ‘bookPrice’ (Choose the right datatype). Assign
 *   the value 150.50 to ‘bookPrice’. Print the price. Now, re-assign a
 *   value to ‘bookPrice’ then print ‘bookPrice’
 *
 * @author: Shabari K S
 */

package com.hands_on;
import java.util.Scanner;

public class ChangeBookPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 150.50;
        System.out.println(price);
        price = scanner.nextDouble();
        System.out.println(price);
    }
}
