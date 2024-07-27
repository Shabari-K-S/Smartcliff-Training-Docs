package com.hands_on;

import java.util.Scanner;

public class KthFactorOfN {
    public static int kthFactorOfN(int n,int pos){
        int[] factors = findFactors(n);
        return factors[pos-1];
    }

    public static int[] findFactors(int n){
        int[] arr = new int[n];
        int k = 0;
        for(int i=1; i<=n; i++){
            if (n%i == 0){
                arr[k++] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println(kthFactorOfN(n, pos));

    }
}
