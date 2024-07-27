package com.handson;
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("enter x :");
       int x = sc.nextInt();
       int c = 0;
       for(int i = 0; i< n; i++) {
       	if(a[i] == x)
       		c++;
       }
      
       System.out.println(c);
	}
}
