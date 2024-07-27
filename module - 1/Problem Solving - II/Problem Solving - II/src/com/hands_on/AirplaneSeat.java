package com.hands_on;

import java.util.Scanner;

public class AirplaneSeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.printf("The Probability of getting airplane seat is %.5f", (1/(double)n));
    }
}
