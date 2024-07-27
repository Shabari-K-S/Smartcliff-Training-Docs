package com.hands_on;

import java.util.Scanner;

public class SeatingArrangement {
    public static int seatingArrangement(int n, int r){
        return (factorial(n)/(factorial(r)*factorial(n-r)));
    }

    public static int factorial(int num){
        if (num == 1){
            return 1;
        } else {
            return num * factorial(num -1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("r = ");
        int r = sc.nextInt();
        System.out.print("The possible arrangement: " + seatingArrangement(n,r));
    }
}
