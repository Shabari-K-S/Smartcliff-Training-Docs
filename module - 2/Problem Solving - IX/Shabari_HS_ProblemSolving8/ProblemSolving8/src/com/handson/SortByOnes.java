package com.handson;
import java.util.Scanner;
public class SortByOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of element: ");
	     int n = sc.nextInt();
	     System.out.println("Enter array:");
	     int a[]=new int[n];
	     for(int i=0;i<n;i++) {
	     	a[i]=sc.nextInt();
	     }
	     int f[] = new int[n];
	     for(int i = 0; i < n-1; i++) {
	    	 for(int j = 0; j < n - i - 1; j++) {
	    		 if(a[j] > a[j+1]) {
	    			 int temp = a[j];
	    			 a[j] = a[j+1];
	    			 a[j+1] = temp;
	    		 }
	    	 }
	     }
	     for(int i = 0; i < n; i++) {
	    	 f[i] = Integer.bitCount(a[i]);
	     }
	     for(int i = 0; i < n-1; i++) {
	    	 for(int j = 0; j < n - i - 1; j++) {
	    		 if(f[j] > f[j+1]) {
	    			 int temp = f[j];
	    			 f[j] = f[j+1];
	    			 f[j+1] = temp;
	    			 int temp2 = a[j];
	    			 a[j] = a[j+1];
	    			 a[j+1] = temp2;
	    		 }
	    	 }
	     }
	     for(int i = 0; i< n;i++) {
	    	 System.out.print(a[i] + " ");
	     }
	}
}
