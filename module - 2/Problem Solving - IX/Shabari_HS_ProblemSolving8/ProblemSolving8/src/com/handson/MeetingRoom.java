package com.handson;
import java.util.Scanner;
public class MeetingRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter row: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[][] = new int[n][2];
       for (int i = 0; i < n; i++) {
       	for(int j =0; j< 2;j++) {
       		a[i][j] = sc.nextInt();
       	}
       }
       int temp;
       for(int i = 0; i<n-1;i++) {
       		for (int j = 0; j < n - i - 1; j++) {
                   if (a[j][0] > a[j+1][1]) {
                   	temp = a[j][0];
                       a[j][0] = a[j + 1][1];
                       a[j + 1][0] = temp;
                   }
       		}
       }
       for (int i = 0; i < n; i++) {
       	for(int j =0; j< 2;j++) {
       		System.out.print(a[i][j] + " ");
       	}
       }
       boolean flag = true;
       for(int i = 1; i < n; i++){
           if(a[i][0] < a[i - 1][1]) {
           	flag = false;
           	break;
           }
       }
       if (flag) {
           System.out.println("True");
       } else {
           System.out.println("false");
       }
	}
}
