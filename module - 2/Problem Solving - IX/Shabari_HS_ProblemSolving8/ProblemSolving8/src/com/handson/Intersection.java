package com.handson;

import java.util.*;
public class Intersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter number of element: ");
	     int n = sc.nextInt();
	     int a[]=new int[n];
	     System.out.print("Enter of element of array 1: ");
	     for(int i=0;i<n;i++) {
	     	a[i]=sc.nextInt();
	     	
	     }
	     System.out.print("Enter number of element: ");
	     int m = sc.nextInt();
	     System.out.print("Enter of element of array 2: ");
	     int b[]=new int[m];
	     for(int i=0;i<m;i++) {
	     	b[i]=sc.nextInt();
	     }
	     Map<Integer, Integer> counts = new HashMap<>();
	        for (int num : a) {
	            counts.put(num, counts.getOrDefault(num, 0) + 1);
	        }
	        List<Integer> result = new ArrayList<>();
	        for (int num : b) {
	            if (counts.containsKey(num) && counts.get(num) > 0) {
	                result.add(num);
	                counts.put(num, counts.get(num) - 1);
	            }
	        }
	        int[] resultArray = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            resultArray[i] = result.get(i);
	        }
	        
	       for(int i:result) {
	    	   System.out.print(i+" ");
	       }

	}

}
