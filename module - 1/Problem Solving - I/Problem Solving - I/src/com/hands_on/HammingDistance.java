package com.hands_on;

import java.util.Scanner;

public class HammingDistance {
    	public static int hammingDistance(int x, int y) {
        	int xor = x ^ y;
        	int count = 0;
        	while (xor != 0) {
        		count += xor & 1;
		        xor >>= 1;
        	}
        	return count;
    	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int firstNum = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		int secondNum = sc.nextInt();
		System.out.println(
			"The Hamming Distance between "+ firstNum 
			+" and "+ secondNum +" is " 
			+ hammingDistance(firstNum, secondNum)
		);
	}
}