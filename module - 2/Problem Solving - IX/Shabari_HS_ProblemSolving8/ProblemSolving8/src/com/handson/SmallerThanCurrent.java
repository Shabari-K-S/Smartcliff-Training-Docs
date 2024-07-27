package com.handson;
import java.util.Scanner;
public class SmallerThanCurrent {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of element: ");
	        int n = sc.nextInt();
	        System.out.println("Enter array :");
	        int a[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	a[i]=sc.nextInt();
	        }
	        int small[]=new int[n];
	        int x=0;
	        for(int i=0;i<n;i++) {
		         int p=partition(a,0,n-1);
		         small[i]=p;
		         x++;
		         if(x<n) {
		         int temp=a[0];
		         a[0]=a[x];
		         a[x]=temp;
	         }
	        }
	        System.out.print("output: ");
	   		for(int val:small) {
		        	System.out.print(val+" ");
		    }
	   		System.out.println();
	} 
   public static int partition(int a[], int s, int e) {
   	int x[]=a.clone();
		int pivot = x[s];
		int l = s + 1;
		int r = e;
		while(l <= r) {
			while(l <= e && x[l] <= pivot) {
				l++;}
			while(r >= s && x[r] > pivot) {
				r--;}
			if(l < r) {
				int temp = x[l];
				x[l] = x[r];
				x[r] = temp;
			}
		}
		x[s] = x[r];
		x[r] = pivot;
		System.out.print("after partition: ");
		for(int val:x) {
      	System.out.print(val+" ");
      	
      }
		System.out.println();
      return r;
	}
}
