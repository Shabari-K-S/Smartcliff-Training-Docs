package com.self_practice;

import java.util.Scanner;

public class DelayedArrivalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrival time of the train: ");
        int arrivalTime = sc.nextInt();
        System.out.println("Enter the delayed time of the train: ");
        int delayedTime = sc.nextInt();
        System.out.println("The train will arrive at: " + delayedArrivalTime(arrivalTime, delayedTime));
    }

    public static int delayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}