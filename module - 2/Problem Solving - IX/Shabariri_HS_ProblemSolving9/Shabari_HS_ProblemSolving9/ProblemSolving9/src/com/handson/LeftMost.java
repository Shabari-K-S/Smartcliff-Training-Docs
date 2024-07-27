package com.handson;

import java.util.Scanner;

public class LeftMost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int a[][] = new int[m][n];
        for(int i = 0; i < m;i++) {
        	for(int j =0; j < n; j++) {
        		a[i][j] = sc.nextInt();
        	}
        }
        int row = 0;
        int col = n - 1;
        int ans = -1;
        while (row < m && col >= 0) {
            if (a[row][col] == 1) {
                ans = col;
                col--;
            } 
            else {
                row++;
            }
        }
		System.out.println(ans);
	}

}
