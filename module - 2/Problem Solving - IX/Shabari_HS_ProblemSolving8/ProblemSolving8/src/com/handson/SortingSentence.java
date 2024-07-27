package com.handson;
import java.util.Scanner;
public class SortingSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter n:");
		int n = sc.nextInt();
		sc.nextLine();
		String a[] = new String[n];
		System.out.println("Enter array:");
		for (int i = 0; i < n; i++){
		    a[i] = sc.nextLine();
		}
		String temp;
		for (int i = 0; i < n - 1 ; i++) {
           for (int j = 0; j < n - i -1 ; j++) {
               if (a[j].charAt(a[j].length()-1) > (a[j + 1]).charAt(a[j+1].length()-1)) {
                   temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;
               }
           }
       }
       for (int i = 0; i < n; i++) {
           System.out.print(a[i].substring(0,a[i].length()-1) + " ");
       }
	}
}