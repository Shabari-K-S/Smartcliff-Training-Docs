package com.handson;
import java.util.Scanner;
public class CountPairs {
	public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of element: ");
    int n = sc.nextInt();
    System.out.println("Enter array:");
    int a[]=new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("Enter the target:");
    int t = sc.nextInt();
    int temp,count = 0;
		for (int i = 0; i < n ; i++) {
			for (int j = i+1; j < n; j++) {
				/*if (a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
				}*/
				if(a[i] + a[j] < t) {
					count++;
				}
        }
		}
		System.out.println(count);
	}
}