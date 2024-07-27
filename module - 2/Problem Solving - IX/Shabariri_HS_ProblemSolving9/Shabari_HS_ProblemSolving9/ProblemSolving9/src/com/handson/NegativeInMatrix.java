package com.handson;
import java.util.Scanner;
public class NegativeInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter m: ");
       int m = sc.nextInt();
       System.out.println("Enter array :");
       int a[][] = new int[n][m];
       for (int i = 0; i < n; i++) {
       	for(int j = 0; j < m; j++) {
       		a[i][j] = sc.nextInt();
       	}
       }
       int c = 0;
       for(int i = 0; i < n; i++) {
       	for(int j = 0; j < m; j++) {
       		if(a[i][j] < 0)
       			c++;
       	}
       }
       System.out.println(c);
	}
}
