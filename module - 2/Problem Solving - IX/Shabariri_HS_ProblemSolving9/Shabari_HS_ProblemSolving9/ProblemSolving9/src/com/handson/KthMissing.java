package com.handson;
import java.util.Scanner;
public class KthMissing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("Enter k :");
       int k = sc.nextInt();
       int i = 0, current = 1, c= 0;
       while(i < k){
       	if (i < n && a[i] == current) {
               i++;
           }
       	else {
               c++;
               if (c == k) {
                   System.out.println(current);
                   break;
               }
           }
           current++;
       }
	}
}
