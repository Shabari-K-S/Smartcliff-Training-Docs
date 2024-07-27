package com.self_practice;

import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                sum1 += i;
            }
        }
        for(int i = 1; i <= m/2; i++) {
            if(m % i == 0) {
                sum2 += i;
            }
        }
        if(sum1/n == sum2/m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

