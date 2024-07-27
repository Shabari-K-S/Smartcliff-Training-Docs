package com.handson;
import java.util.Scanner;
public class Chocolate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array:");
		for (int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		System.out.println("enter the money :");
		int m = sc.nextInt();
		for (int i = 0; i < n - 1; i++){
			int pos = i;
	            for (int j = i + 1; j < n; j++) {
	                if (a[j] < a[pos]) {
	                    pos = j;
	                }
	            }
	            int temp = a[pos];
	            a[pos] = a[i];
	            a[i] = temp;
		}
		if(a[0]  + a[1] <= m)
			System.out.println(m-(a[0] + a[1]));
		else
			System.out.println(m);
	}
}
