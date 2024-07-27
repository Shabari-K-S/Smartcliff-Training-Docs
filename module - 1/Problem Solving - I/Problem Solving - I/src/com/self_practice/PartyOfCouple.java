package com.self_practice;

import java.util.Scanner;

public class PartyOfCouple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people in the party: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The only single person in the party of couples: " + singlePerson(arr));
    }

    public static int singlePerson(int[] arr) {
        int singlePerson = 0;
        for (int i : arr) {
            singlePerson ^= i;
        }
        return singlePerson;
    }
}