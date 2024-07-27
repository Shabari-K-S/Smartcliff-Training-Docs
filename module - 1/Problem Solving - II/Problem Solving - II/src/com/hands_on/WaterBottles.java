package com.hands_on;

import java.util.Scanner;

public class WaterBottles {
    public static int maxWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            total += newBottles;
            numBottles = newBottles + numBottles % numExchange;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bottles: ");
        int numBottles = sc.nextInt();
        System.out.println("Enter the number of exchange: ");
        int numExchange = sc.nextInt();
        System.out.println(
                "The maximum number of water bottles you can drink is "
                        + maxWaterBottles(numBottles, numExchange)
        );
    }
}