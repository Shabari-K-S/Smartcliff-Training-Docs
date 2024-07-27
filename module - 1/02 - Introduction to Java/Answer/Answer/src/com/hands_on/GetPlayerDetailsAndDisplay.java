/**
 * 8. Create the variables for a player's name, age, height in cm, weight
 *    in kg, rank, and mobile number, and assign the values of your
 *    choice. Display the player detail. (byte, short, int, double, String
 *    datatypes can be used).
 *
 * @author: Shabari K S
 */

package com.hands_on;

import java.util.Scanner;

public class GetPlayerDetailsAndDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        String rank = scanner.nextLine();
        int mobileNumber = scanner.nextInt();

        System.out.println("Name = "+playerName);
        System.out.println("Age = "+age);
        System.out.println("Height = "+height);
        System.out.println("Weight = "+weight);
        System.out.println("Rank = "+rank);
        System.out.println("Mobile Number = "+mobileNumber);
    }
}
