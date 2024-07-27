package com.hands_on;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        squarePattern(num);
    }
	public static void squarePattern(int num){
		for(int i = 0;i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print(num+" ");
			}
		System.out.println();
		}
	}
}