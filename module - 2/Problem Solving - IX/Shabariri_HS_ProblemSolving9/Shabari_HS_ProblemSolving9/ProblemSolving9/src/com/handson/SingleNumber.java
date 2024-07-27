package com.handson;
import java.util.Scanner;
public class SingleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       int ans = a[0];
       for (int i = 1; i < n; i++) {
           ans = ans ^ a[i];
       }
       System.out.println(ans);
	}
}
