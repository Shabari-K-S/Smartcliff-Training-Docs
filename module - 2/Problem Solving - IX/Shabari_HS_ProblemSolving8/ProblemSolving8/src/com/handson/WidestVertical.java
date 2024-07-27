package com.handson;

import java.util.Scanner;

public class WidestVertical {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rouws : ");
        int r = sc.nextInt();
        int arr[][] = new int[r][2]; 
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt(); 
        }
        int a[]=new int[r];
        for(int i=0;i<r;i++) {
        	a[i]=arr[i][0];
        }
        for(int i=0;i<r-1;i++) {
        	for(int j=0;j<r-i-1;j++) {
        		if(a[j]>a[j+1]) {
        			int temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
        	}
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<r-1;i++) {
        	max=Math.max(max, Math.abs(a[i]-a[i+1]));
        }
        System.out.print(max);
        sc.close();
	}
}
