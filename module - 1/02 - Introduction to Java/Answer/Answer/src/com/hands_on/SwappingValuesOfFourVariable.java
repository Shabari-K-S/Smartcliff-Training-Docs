/**
 * 15. Declare four variables numberOne, numberTwo, numberThree,
 *     and numberFour of integer type. Assign the values of your choice
 *     for the variables numberOne, numberTwo and numberThree.
 *     Assign 1000 to numberFour. Print the values. Now re-assign the
 *     values as follows to print,
 *   1. numberOne’s value to numberTwo
 *   2. numberTwo’s value to numberThree
 *   3. numberThree’s value to numberFour
 *   4. 100 to numberOne
 */

package com.hands_on;

public class SwappingValuesOfFourVariable {
    public static void main(String[] args) {
        int numberOne = 10, numberTwo = 20, numberThree = 30, numberFour = 1000;
        System.out.println(numberOne + " " + numberTwo + " " + numberThree + " " + numberFour);
        numberFour = numberThree;
        numberThree = numberTwo;
        numberTwo = numberOne;
        numberOne = 100;
        System.out.println(numberOne + " " + numberTwo + " " + numberThree + " " + numberFour);
    }
}