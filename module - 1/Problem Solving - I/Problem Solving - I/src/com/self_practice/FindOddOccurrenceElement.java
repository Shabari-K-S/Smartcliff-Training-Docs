package com.self_practice;

import java.util.HashMap;

import java.util.Scanner;

public class FindOddOccurrenceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println("The element which occurs an odd number of times: " + findOddOccurrenceElement(arr));
        }
    }

    public static int findOddOccurrenceElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}