package com.handson;

import java.util.Scanner;

public class InversionArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(a[i]>a[j] && i<j) {
        			c++;
        			System.out.println("pairs:("+ a[i] + " " +a[j]+")");
        		}
        	}
        }
        sc.close();
        System.out.print(c);
	}
}
