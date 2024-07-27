package com.handson;

import java.util.Scanner;

public class IncreasingSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        int len=0;
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(a[i]>a[j]){
                    if(dp[j]>len)
                        len=dp[j];
                }
            }
            dp[i]=len+1;
            len=0;
            if(dp[i]>max){
                max=dp[i];
            }
        }
       System.out.println(max);
	    
	}

}
