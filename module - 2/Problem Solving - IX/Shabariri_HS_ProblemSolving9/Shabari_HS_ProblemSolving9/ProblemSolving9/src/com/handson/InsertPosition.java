package com.handson;
import java.util.Scanner;
public class InsertPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("enter the target : ");
       int t = sc.nextInt();
       int l = 0, h =n-1 , mid = 0;
       boolean flag = false;
       while (l <= h) {
       	mid = (l+h)/2;
       	if(a[mid] == t) {
       		System.out.println(mid);
       		flag = true;
       		break;
       	}
       	else if(a[mid] < t) {
       		l = mid + 1;
       	}
       	else
       		h = mid - 1;
       	}
       if(flag == false)
       	System.out.println(l);
       }
	}
