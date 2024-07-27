package com.Main;

import java.util.Scanner;

public class SortIntegersByTheNumberOfOneBits {
    public static void sortInteger(int[] nums) {
        String[] arr = new String[nums.length];
        int i = 0;
        for (int n: nums) {
            arr[i++] = Integer.toBinaryString(n);
        }
        for(i=0; i<nums.length; i++) {
            arr[i] = arr[i].replaceAll("0", "");
        }
        for(String s : arr) {
            System.out.println(s);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortInteger(arr);
    }
}
