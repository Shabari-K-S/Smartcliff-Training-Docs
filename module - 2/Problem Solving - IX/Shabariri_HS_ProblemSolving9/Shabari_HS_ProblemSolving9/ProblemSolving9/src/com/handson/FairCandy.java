package com.handson;
import java.util.Scanner;
public class FairCandy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n1:");
		int n1 = sc.nextInt();
		int alice[] = new int[n1];
		System.out.println("Enter array:");
		for (int i = 0; i < n1; i++){
		    alice[i] = sc.nextInt();
		}
		System.out.println("Enter n2:");
		int n2 = sc.nextInt();
		int bob[] = new int[n2];
		System.out.println("Enter array:");
		for (int i = 0; i < n2; i++){
		    bob[i] = sc.nextInt();
		}
		int c1 = 0, c2 = 0;
	    for (int i : alice)
	    	c1 += i;
	    for (int i : bob)
	    	c2 += i;
	    for (int i = 0; i < n1; i++) {
	      for (int j = 0; j < n2; j++) {
	        if ((c1 - alice[i] + bob[j]) == (c2 - bob[j] + alice[i])) {
	        	System.out.println(alice[i] + " " + bob[j]);
	        	break;
	        }
	      }
	    }
	}
}
