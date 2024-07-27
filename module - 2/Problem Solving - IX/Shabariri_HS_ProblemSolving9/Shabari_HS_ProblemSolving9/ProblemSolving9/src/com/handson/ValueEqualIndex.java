package com.handson;
import java.util.Scanner;
public class ValueEqualIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n+1];
       for (int i = 1; i <= n; i++) {
           a[i] = sc.nextInt();
       }
       for (int i = 1; i <= n; i++) {
           if(a[i] == i) {
           	System.out.println(a[i]);
           }
       }
	}
}
