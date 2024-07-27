package com.self_practice;

import java.util.Scanner;

public class MissingArtifact {
    public static int missingArtifact(int[] items) {
        int n = items.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int item : items) {
            sum += item;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }
        System.out.println(
                "The missing artifact is: "
                        + missingArtifact(items)
        );
    }
}