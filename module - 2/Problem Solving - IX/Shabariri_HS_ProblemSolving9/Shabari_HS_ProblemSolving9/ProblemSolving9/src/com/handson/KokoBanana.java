package com.handson;

import java.util.Scanner;

public class KokoBanana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println("enter hours :");
        int h = sc.nextInt();
        int t = 0;
        for (int i : a) {
            t += i;
        }
        int speed = (int) Math.ceil((double) t / h);
		System.out.println(speed);

	}

}
