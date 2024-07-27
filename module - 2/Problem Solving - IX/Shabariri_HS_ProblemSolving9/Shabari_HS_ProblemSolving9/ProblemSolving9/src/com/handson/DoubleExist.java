package com.handson;
import java.util.Scanner;
public class DoubleExist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       boolean flag = false;
       for (int i = 0; i < n; i++) {
       	for(int j = i+1; j < n; j++) {
       		if(a[i] == 2*a[j]) {
       			flag = true;
       			break;
       		}
       	}
       }
       if(flag)
       	System.out.println("true");
       else
       	System.out.println("false");
      
      
	}
}
