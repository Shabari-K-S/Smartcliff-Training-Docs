package com.handson;
import java.util.Scanner;
public class ArithmrticProgression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       System.out.println("Enter array :");
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       for (int i = 0; i < n - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < n; j++) {
               if (a[j] < a[minIndex]) {
                   minIndex = j;
               }
           }
           if (minIndex != i) {
               int temp = a[minIndex];
               a[minIndex] = a[i];
               a[i] = temp;
           }
       }
       boolean flag = true;
       int diff = a[1] - a[0];
       for (int i = 1; i < n; i++) {
           if (a[i] - a[i - 1] != diff) {
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
