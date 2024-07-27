package com.handson;
import java.util.Scanner;
public class MissingInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array:");
		for (int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		int sum = a[0];
       for(int i = 1; i < n; i++)
       {
           if(a[i] == a[i-1]+1)
           	sum = sum + a[i];
           else
           	break;
       }
       System.out.println(sum);
	}
}
