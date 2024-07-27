package com.handson;
import java.util.*;
public class FindingDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1:");
		String s1 = sc.nextLine();
		System.out.println("Enter the string 2 : ");
		String s2 = sc.nextLine();
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		char temp,temp2;
		for (int i = 0; i < c1.length - 1; i++) {
           for (int j = 0; j < c1.length - i - 1; j++) {
           	if (c1[j] > c1[j + 1]) {
                   temp = c1[j];
                   c1[j] = c1[j + 1];
                   c1[j + 1] = temp;
                
               }
           }
       }
		for (int i = 0; i < c2.length - 1; i++) {
           for (int j = 0; j < c2.length - i - 1; j++) {
           	if (c2[j] > c2[j + 1]) {
                   temp2 = c2[j];
                   c2[j] = c2[j + 1];
                   c2[j + 1] = temp2;
                
               }
           }
       }
		int l = Math.min(c1.length, c2.length);
		boolean flag = false;
		for(int i = 0; i < l; i++) {
			if(c1[i] != c2[i]) {
				System.out.println(c2[i]);
				flag = true;
				break;
			}
		}
		if(!flag) {
			 if (c1.length < c2.length) {
	            System.out.println(c2[c1.length]);
	          }
			 else if (c1.length > c2.length) {
	                System.out.println(c1[c2.length]);
			 }
		}
	}
}
