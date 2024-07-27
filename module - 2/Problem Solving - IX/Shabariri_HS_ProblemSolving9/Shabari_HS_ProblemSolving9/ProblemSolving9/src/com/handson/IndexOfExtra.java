package com.handson;
import java.util.Scanner;
public class IndexOfExtra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("Enter array :");
       int b[] = new int[n-1];
       for (int i = 0; i < n-1; i++) {
           b[i] = sc.nextInt();
       }
       for (int i = 0; i < n; i++) {
           if(a[i] != b[i]) {
           	System.out.println(i);
           	break;
           }
       }
	}
}
