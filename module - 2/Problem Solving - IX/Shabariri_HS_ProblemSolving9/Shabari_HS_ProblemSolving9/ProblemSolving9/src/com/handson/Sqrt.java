package com.handson;
import java.util.Scanner;
public class Sqrt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       int i = 1;
       while(i <= n) {
       	int ans = i * i;
       	if(ans == n) {
       		System.out.println(i);
       		break;
       	}
       	else if(ans > n) {
       		i--;
       		System.out.println(i);
       		break;
       	}
       	else
       		i++;
       }
	}
}
