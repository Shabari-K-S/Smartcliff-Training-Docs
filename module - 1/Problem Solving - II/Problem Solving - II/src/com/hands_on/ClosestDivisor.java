package com.hands_on;

import java.util.Scanner;

public class ClosestDivisor {
    public static int[] closestDivisors(int num) {
        int[] divisors1 = findDivisors(num + 1);
        int[] divisors2 = findDivisors(num + 2);
         return Math.abs(divisors1[0] - divisors1[1]) < Math.abs(divisors2[0] - divisors2[1]) ? divisors1 : divisors2;
    }

    public static int[] findDivisors(int num) {
        int[] divisors = new int[2];
        for (int i = (int) Math.sqrt(num); i > 0; i--) {
            if (num % i == 0) {
                divisors[0] = i;
                divisors[1] = num / i;
                break;
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int[] result = closestDivisors(num);
        System.out.println("The Closest Divisor for "+ num +" is [" + result[0] + "," + result[1] + "]");
    }
}