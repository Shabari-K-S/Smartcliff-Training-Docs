package com.self_practice;

import java.util.Scanner;

public class TeenSum {
    public int calculateSum(int a, int b){
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return 19;
        }
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        TeenSum ts = new TeenSum();
        int sum = ts.calculateSum(a, b);
        System.out.println(sum);

        sc.close();
    }
}