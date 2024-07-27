package com.hands_on;

import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] A) {
        int count = 0, candidate = -1;
        for (int num : A) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        count = 0;
        for (int num : A) {
            if (num == candidate) {
                count++;
            }
        }
        return count > A.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("The majority element is: " + majorityElement(A));
    }
}