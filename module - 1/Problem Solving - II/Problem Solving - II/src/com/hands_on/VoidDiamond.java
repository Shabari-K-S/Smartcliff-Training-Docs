package com.hands_on;

import java.util.Scanner;

public class VoidDiamond {
    public static void voidDiamond(int n) {
        for(int i=1; i<=n/2+1; i++)
        {
            for(int j=1; j<=n/2+1-i+1; j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<=2*i-2; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(n/2+1)-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=(n/2+1)-1; i>=1; i--)
        {
            for(int j=i; j<=n/2+1; j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<=(2*i)-2; k++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=n/2+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        voidDiamond(n);
    }
}