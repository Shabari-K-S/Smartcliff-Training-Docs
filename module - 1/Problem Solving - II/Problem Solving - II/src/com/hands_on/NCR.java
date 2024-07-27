package com.hands_on;

import java.util.Scanner;

public class NCR {
    public static int nCr(int n, int r){
        int ncrValue = (factorial(n)/ (factorial(r)* factorial(n-r)) );
        return ncrValue;
    }
    public static int factorial(int num){
        if (num == 1){
            return 1;
        }else{
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println("The value of "+n+"C"+r+" is "+ nCr(n,r));

    }
}
