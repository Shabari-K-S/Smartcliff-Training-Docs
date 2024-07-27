package com.handson;

import java.util.Scanner;

public class InfiniteSorted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       int x = -1;
       for(int i = 0; i< n; i++) {
       	if(a[i] == 1) {
       		System.out.println(i);
       		x = 1;
       		break;
       	}
       }
       if(x == -1)
       	System.out.println(x);
	}
}
