package com.hands_on;

import java.util.Scanner;

public class SumOfTwoPrimeNumbers {
    public static int[] sumOfTwoPrimeNumber(int num){
        int[] arr = new int[2];
        outer:
        for(int i = 2; i<=num; i++){
            if (isPrime(i)) {
                for (int j = 2;j<=num ; j++ ) {
                    if (isPrime(j)){
                        if (i+j == num){
                            arr[0] = i;
                            arr[1] = j;
                            break outer;
                        }
                    }
                }
            }
        }

        return arr;
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int[] res = sumOfTwoPrimeNumber(num);
        System.out.println(res[0]+" "+res[1]);
    }
}
