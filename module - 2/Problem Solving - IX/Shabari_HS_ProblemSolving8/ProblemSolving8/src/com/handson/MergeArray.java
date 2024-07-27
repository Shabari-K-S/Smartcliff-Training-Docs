package com.handson;
import java.util.Scanner;
public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter n: ");
	     int n = sc.nextInt();
	     System.out.println("Enter m : ");
	     int m = sc.nextInt();
	     System.out.println("Enter array 1:");
	     int a[]=new int[n];
	     for(int i=0;i<n;i++) {
	     	a[i]=sc.nextInt();
	     }
	     System.out.println("Enter array 2:");
	     int b[]=new int[m];
	     for(int i=0;i<m;i++) {
	     	b[i]=sc.nextInt();
	     }
	     int c[] = new int[m+n];
	     for (int i = 0; i < n; i++) {
	            c[i] = a[i];
	        }
	        for (int i = 0; i < m; i++) {
	            c[n + i] = b[i];
	        }
	     int temp;
	     for (int i = 0; i < m+n - 1; i++) {
				for (int j = 0; j < m+n - i -1; j++) {
					if (c[j] > c[j + 1]) {
	                 temp = c[j];
	                 c[j] = c[j + 1];
	                 c[j + 1] = temp;
					}
				}
	     }
	     for(int i = 0; i < m+n; i++) {
	    	 System.out.print(c[i] + " ");
	     }
	}
}
