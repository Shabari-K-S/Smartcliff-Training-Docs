package com.handson;

import java.util.Scanner;

public class Minimized {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println("enter n stores :");
        int m = sc.nextInt();
		int low = 1 ;
        int high = Integer.MIN_VALUE ;
        int result = 0 ;
        
        for (int i : a)
            high = Math.max(high, i) ;
        
        while (low <= high) {
            int mid = low + (high-low)/2 ;
            int stores = 0 ;
            
            for (int j : a) {
                stores += j/mid ;
                if (j % mid > 0) 
                	stores++ ;
            }
            if (stores <= m) {
                result = mid ;
                high = mid-1 ;
            }
            else low = mid+1 ;
        }
        System.out.println(result);
	}

}
