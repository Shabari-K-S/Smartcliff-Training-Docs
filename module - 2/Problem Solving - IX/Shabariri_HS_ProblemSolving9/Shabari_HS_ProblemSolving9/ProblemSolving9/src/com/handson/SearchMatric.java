package com.handson;
import java.util.Scanner;
public class SearchMatric {
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
       System.out.println("Enter x :");
       int x = sc.nextInt();
       int ans = 0;
       for (int i = 0; i < n; i++) {
       	for(int j = 0; j < m; j++) {
       		if( x== a[i][j]) {
       			ans = 1;
       		}
       	}
       }
       System.out.println(ans);
      
	}
}
