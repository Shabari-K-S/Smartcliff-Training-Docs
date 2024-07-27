package com.handson;
import java.util.Scanner;
public class WaveForm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter number of element: ");
	     int n = sc.nextInt();
	     System.out.println("Enter array:");
	     int a[]=new int[n];
	     for(int i=0;i<n;i++) {
	     	a[i]=sc.nextInt();
	     }
	     int temp,temp2;
	     for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - i -1; j++) {
					if (a[j] > a[j + 1]) {
	                 temp = a[j];
	                 a[j] = a[j + 1];
	                 a[j + 1] = temp;
					}
				}
	     }
	     for (int i = 0; i < n - 1; i += 2) {
	            temp2 = a[i];
	            a[i] = a[i + 1];
	            a[i + 1] = temp2;
	     }
	     for(int i = 0; i < n; i++) {
	    	 System.out.print(a[i] + " ");
	     }
	}
}
