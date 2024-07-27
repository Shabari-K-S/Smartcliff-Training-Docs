package com.handson;

import java.util.Scanner;

public class FairCandy {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of element: ");
    int m = sc.nextInt();
    int arr[]=new int[m];
    for(int i=0;i<m;i++) {
    	arr[i]=sc.nextInt();
    }
    
    System.out.print("Enter number of element: ");
    int n = sc.nextInt();
    int brr[]=new int[n];
    for(int i=0;i<n;i++) {
    	brr[i]=sc.nextInt();
    }
    int aliceTotal = 0;
    int bobTotal = 0;
    for (int candies : arr) aliceTotal += candies;
    for (int candies : brr) bobTotal += candies;
    outer:
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        if ((aliceTotal - arr[i] + brr[j]) == (bobTotal - brr[j] + arr[i])) {
        	System.out.print(arr[i]+" "+brr[j]);
        	break outer;
        }
}}