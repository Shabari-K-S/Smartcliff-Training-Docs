package com.hands_on;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for(int i=1; i<n+1; i++){
            for(int j=n-i; j<n; j++ ){
                System.out.print((char)(j+65));
            }
            System.out.println();
        }
    }
}
