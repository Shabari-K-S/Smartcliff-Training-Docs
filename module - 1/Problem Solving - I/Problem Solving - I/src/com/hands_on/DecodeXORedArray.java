package com.hands_on;

import java.util.Scanner;

public class DecodeXORedArray {
	    public static int[] decodeXORedArray(int[] encoded, int first) {
        	int n = encoded.length;
	        int[] arr = new int[n + 1];
        	arr[0] = first;
	        for (int i = 0; i < n; i++) {
        	    arr[i + 1] = arr[i] ^ encoded[i];
	        }
        	return arr;
    	}
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the number of elements: ");
        	int n = sc.nextInt();
        	int[] encoded = new int[n];
        	System.out.println("Enter the elements of the array: ");
        	for (int i = 0; i < n; i++) {
        		encoded[i] = sc.nextInt();
        	}
        	System.out.print("Enter the first element: ");
        	int first = sc.nextInt();
        	int[] result = decodeXORedArray(encoded, first);
        	System.out.println("The original array is: ");
        	for (int i : result) {
        		System.out.print(i + " ");
        	}
	}
}