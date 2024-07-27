package com.handson;
import java.util.Scanner;
public class Similarities {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n1: ");
       int n1 = sc.nextInt();
       System.out.println("Enter array 1:");
       int a1[] = new int[n1];
       for (int i = 0; i < n1; i++) {
           a1[i] = sc.nextInt();
       }
       System.out.println("Enter n2: ");
       int n2 = sc.nextInt();
       System.out.println("Enter array 2:");
       int a2[] = new int[n2];
       for (int i = 0; i < n2; i++) {
           a2[i] = sc.nextInt();
       }
       int inter = 0,union = 0;
       for (int i = 0; i < n1; i++) {
           for (int j = 0; j < n2; j++) {
               if (a1[i] == a2[j]) {
                   inter++;
                   break;
               }
           }
       }
       union = n1+n2-inter;
       System.out.println(inter+ " " +union);
	}
}
