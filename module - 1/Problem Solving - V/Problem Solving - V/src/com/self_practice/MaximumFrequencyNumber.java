package com.self_practice;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element with maximum frequency: " + maxFrequencyNumber(arr));
    }

    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > maxFreq) {
                maxFreq = map.get(arr[i]);
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}