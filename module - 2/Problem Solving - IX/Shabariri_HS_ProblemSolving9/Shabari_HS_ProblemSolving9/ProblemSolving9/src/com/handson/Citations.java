package com.handson;

import java.util.Scanner;

public class Citations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
		int l = 0,r = n-1,h = 0;
        while(l <= r){
            int mid = (l + r)/2;
            if(n-mid <= a[mid]){
                h = n - mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println(h);
	}

}
