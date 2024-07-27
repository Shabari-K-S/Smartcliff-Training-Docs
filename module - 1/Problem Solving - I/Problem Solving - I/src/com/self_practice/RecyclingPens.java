package com.self_practice;

import java.util.Scanner;

public class RecyclingPens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the number of empty pens, rupees, reward, and cost: ");
            int n = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("The maximum number of usable pens that you can get: " + maxUsablePens(n, r, k, c));
        }
    }

    public static int maxUsablePens(int n, int r, int k, int c) {
        int pensByRecycling = r / k;
        int pensByBuyingRefills = n / c;
        return Math.min(pensByRecycling, pensByBuyingRefills);
    }
}