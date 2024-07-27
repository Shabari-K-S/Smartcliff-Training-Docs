package com.self_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FunnyDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Sum of numbers divisible by 2 or 3: " + sumDivisibleBy2Or3(list));
    }

    public static int sumDivisibleBy2Or3(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0 || integer % 3 == 0) {
                sum += integer;
            }
        }
        return sum;
    }
}