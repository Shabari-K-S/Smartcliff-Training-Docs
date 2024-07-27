package com.handson;
import java.util.Scanner;
public class SortParity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of element: ");
	     int n = sc.nextInt();
	     System.out.println("Enter array:");
	     int a[]=new int[n];
	     for(int i=0;i<n;i++) {
	     	a[i]=sc.nextInt();
	     }
	     int l = 0, r = n-1;
	     while(l < r) {
	    	 if(a[l] % 2 == 0) {
	    		 l++;
	    	 }
	    	 else {
	    		 int temp = a[l];
	    		 a[l] = a[r];
	    		 a[r] = temp;
	    		 r--;
	    	 }
	     }
	     for(int i = 0; i < n; i++) {
	    	 System.out.print(a[i] + " ");
	     }
	}
}
