package com.hands_on;

import java.util.Scanner;

public class FindTransitionPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points you want to find: ");
        int n = sc.nextInt();
        System.out.println("Enter the transition points you want to find: ");
        int[] transitionPoints = new int[n];
        for (int i = 0; i < n; i++) {
            transitionPoints[i] = sc.nextInt();
        }
        System.out.println("the value of transition points is: ");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (transitionPoints[i] == 1) {
                found = true;
            }
        }
        System.out.println(found);
    }
}
