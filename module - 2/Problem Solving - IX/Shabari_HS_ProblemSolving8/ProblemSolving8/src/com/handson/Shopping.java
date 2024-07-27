package com.handson;
import java.util.*;
public class Shopping {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n for pants:");
		int n1 = sc.nextInt();
		int pants[] = new int[n1];
		System.out.println("Enter pants array:");
		for (int i = 0; i < n1; i++){
		    pants[i] = sc.nextInt();
		}
		System.out.println("Enter n for shirts:");
		int n2 = sc.nextInt();
		int shirts[] = new int[n2];
		System.out.println("Enter array:");
		for (int i = 0; i < n2; i++){
		    shirts[i] = sc.nextInt();
		}
		System.out.println("Enter n for shoe:");
		int n3 = sc.nextInt();
		int shoe[] = new int[n3];
		System.out.println("Enter array:");
		for (int i = 0; i < n3; i++){
		    shoe[i] = sc.nextInt();
		}
		System.out.println("Enter n for skirt:");
		int n4 = sc.nextInt();
		int skirt[] = new int[n4];
		System.out.println("Enter array:");
		for (int i = 0; i < n4; i++){
		    skirt[i] = sc.nextInt();
		}
		System.out.println("Enter the amount :");
		int budget  = sc.nextInt();
		int answer = 0;
	    int[]ans = new int[n1 * n2];
	    int x = 0;
	    for (int pant : pants) {
	        for (int i : shirts) {
	            ans[x++] = pant + i;
	        }
	    }
	    Arrays.sort(ans);
	    for (int i : shoe) {
	        for (int j : skirt) {
	            int r = (budget - i) - j;
	            answer += countValidCombinations(ans, r);
	        }
	    }
	    System.out.println(answer);
}
	 public static int countValidCombinations(int[] array, int value) {
	        int left = 0;
	        int right = array.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (array[mid] <= value) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }	 
	
	}
