package com.handson;
import java.util.Scanner;
public class PositiveInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array:");
		for (int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		int temp;
		boolean flag = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
                   temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
               }
           }
			
			for (int k = 0; k < n - i -1; k++) {
           	if(a[n- i -1] + a[k] == 0) {
           		System.out.println(a[n- i -1]);
           		i = n;
           		flag = true;
           	}
            }
       }
		if(flag == false) {
			System.out.println("-1");
		}
	}
}
