package com.handson;

import java.util.Scanner;

public class SpecialArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[] = new int[n];
        for(int i = 0; i < n;i++) {
        	a[i] = sc.nextInt();
        }
        
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j : a) {
                if (j >= i) {
                    cnt++;
                }
            }
            if (cnt == i) {
                ans = i;
                break;
            }
        }
        
        System.out.println(ans);

	}

}
