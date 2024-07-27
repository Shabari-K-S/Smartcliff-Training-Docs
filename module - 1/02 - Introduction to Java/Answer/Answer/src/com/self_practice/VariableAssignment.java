/**
 * 7. Do the following and explore what is happening. (Print the values to see the impact)
 * a. Initialize an integer variable ‘price’ with the value 52 and assign it to a float variable ‘priceInFloat’.
 * b. Initialize a byte variable ‘age’ with the value 83 and assign it to an integer variable ‘intAge’.
 * c. Initialize an integer variable ‘highestAge’ to 120 and assign it to a byte variable ‘byteAge’.
 * d. Change the value of ‘highestAge’ to 130 and assign it to ‘byteAge’.
 */

package com.self_practice;

public class VariableAssignment {
    public static void main(String[] args) {
        // Initialize an integer variable 'price' with the value 52 and
        // assign it to a float variable 'priceInFloat'.
        int price = 52;
        float priceInFloat = price;
        System.out.println("price: " + price);
        System.out.println("priceInFloat: " + priceInFloat);

        // Initialize a byte variable 'age' with the value 83 and
        // assign it to an integer variable 'intAge'.
        byte age = 83;
        int intAge = age;
        System.out.println("age: " + age);
        System.out.println("intAge: " + intAge);

        // Initialize an integer variable 'highestAge' to 120 and
        // assign it to a byte variable 'byteAge'.
        int highestAge = 120;
        byte byteAge = (byte) highestAge;
        System.out.println("highestAge: " + highestAge);
        System.out.println("byteAge: " + byteAge);

        // Change the value of 'highestAge' to 130 and
        // assign it to 'byteAge'.
        highestAge = 130;
        byteAge = (byte) highestAge;
        System.out.println("highestAge: " + highestAge);
        System.out.println("byteAge: " + byteAge);
    }
}