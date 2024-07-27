/**
 * 9. Read a person's name first, read another person and another.
 *    Greet the first person first, the third person second and the second
 *    person last. If ‘Chloe’, ‘Joey’ & ‘Zoe’ are the inputs, then the
 *    output will be ‘Welcome Chloe! Welcome Zoe! Welcome Joey too!’
 */

package com.hands_on;

import java.util.Scanner;

public class GreetThreePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstPerson = sc.nextLine();
        String secondPerson = sc.nextLine();
        String thirdPerson = sc.nextLine();

        System.out.println("Welcome " + firstPerson + "!");
        System.out.println("Welcome " + thirdPerson + "!");
        System.out.println("Welcome " + secondPerson + "!");
    }
}
