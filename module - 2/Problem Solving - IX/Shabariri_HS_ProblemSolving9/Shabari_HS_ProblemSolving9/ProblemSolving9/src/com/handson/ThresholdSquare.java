package com.handson;

import java.util.*;

public class ThresholdSquare {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows:");
	        int n = scanner.nextInt();
	        System.out.println("Enter the number of columns:");
	        int m = scanner.nextInt();
	        int[][] mat = new int[n][m];
	        System.out.println("Enter the matrix elements :");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                mat[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.println("Enter the threshold:");
	        int t = scanner.nextInt();
	        int ans = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                int s = 1, e = Math.min(n, m);
	                while (s <= e) {
	                    int mid = s + (e - s) / 2;
	                    if (mid + i > n || m < mid + j) {
	                        e = mid - 1;
	                    } else {
	                        int sum = 0;
	                        for (int x = i; x < i + mid; x++) {
	                            for (int y = j; y < j + mid; y++) {
	                                sum += mat[x][y];
	                            }
	                        }
	                        if (sum <= t) {
	                            s = mid + 1;
	                            if (mid > ans) {
	                                ans = mid;
	                            }
	                        } else {
	                            e = mid - 1;
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println(ans);
	    }

}
