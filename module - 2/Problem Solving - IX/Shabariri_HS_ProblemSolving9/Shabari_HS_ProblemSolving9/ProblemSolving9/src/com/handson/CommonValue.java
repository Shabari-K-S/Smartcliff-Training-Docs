package com.handson;
import java.util.Scanner;
public class CommonValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("Enter n2: ");
       int n2 = sc.nextInt();
       System.out.println("Enter array :");
       int b[] = new int[n2];
       for (int i = 0; i < n2; i++) {
           b[i] = sc.nextInt();
       }
       int x = -1;
       for(int i = 0; i < n; i++) {
       	for(int j = 0; j < n2; j++) {
       		if(a[i] == b[j]) {
       			System.out.println(a[i]);
       			x = 1;
       			break;
       		}
       	}
       }
       if(x == -1)
       	System.out.println(x);
	}
}
