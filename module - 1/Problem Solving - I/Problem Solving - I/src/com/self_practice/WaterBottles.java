package com.self_practice;

import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter the number of water bottles and empty bottles required to exchange: "
        );
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        System.out.println(
                "The maximum number of water bottles you can drink: "
                        + maxWaterBottles(numBottles, numExchange)
        );
    }

    public static int maxWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int fullBottles = emptyBottles / numExchange;
            totalBottles += fullBottles;
            emptyBottles = fullBottles + (emptyBottles % numExchange);
        }
        return totalBottles;
    }
}