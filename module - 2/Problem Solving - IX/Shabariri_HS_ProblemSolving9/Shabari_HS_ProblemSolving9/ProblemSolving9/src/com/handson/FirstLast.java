package com.handson;
import java.util.Scanner;
public class FirstLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       System.out.println("enter target : ");
       int t = sc.nextInt();
       int ans[] = new int[2] ;
       int x = 0;
       int low = 0, high = n-1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(a[mid] == t) {
				ans[x] = mid;
				if(mid - 1 >= 0 && a[mid - 1] == t)
					high = mid - 1 ;
				else
					low = mid + 1;
				x++;
			}
			else if(a[mid] < t)
				low = mid+1;
			else
				high = mid-1;
		}
		System.out.print(ans[1] + "," + ans[0]);
	}
}
