package com.handson;

import java.util.Scanner;

public class LimitOfBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println("enter maxoperation :");
        int m = sc.nextInt();
        int min = 0;
        int max = 1000000000;
        while (min + 1 < max) {
            int mid = (max - min)/2 + min;
            int count = 0;
            for (int i: a) {
                count += (i-1) / mid;
            }
            if (count <= m) {
                max = mid;
            } else {
                min = mid;
            }
        }
        System.out.println(max);
	}

}
