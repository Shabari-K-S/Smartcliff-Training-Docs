package com.hands_on;

import java.util.Scanner;

public class PoorPigs {
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest){
        int pigs = 0;
        while (Math.pow((minutesToTest / minutesToDie + 1), pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of buckets: ");
        int buckets = sc.nextInt();
        System.out.print("Enter the minutes to die: ");
        int minutesToDie = sc.nextInt();
        System.out.print("Enter the minutes to test: ");
        int minutesToTest = sc.nextInt();
        System.out.println(poorPigs(buckets, minutesToDie, minutesToTest));
    }
}