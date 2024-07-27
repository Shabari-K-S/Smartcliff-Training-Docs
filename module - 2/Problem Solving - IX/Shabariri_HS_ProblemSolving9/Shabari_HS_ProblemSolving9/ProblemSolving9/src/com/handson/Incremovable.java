package com.handson;

import java.util.Scanner;

public class Incremovable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; ) {
            int j = i + 1;
            while (j < n && a[j] > a[j - 1]) {
                j++;
            }
            int len = j - i;
            count += (len * (len + 1)) / 2;
            i = j;
        }
        System.out.println(count);
		
	}

}
