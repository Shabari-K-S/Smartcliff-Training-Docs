package com.self_practice;

import java.util.Scanner;

public class DecimalToBinary {
    public void convertToBinary(int n){
        int[] binary = new int[1000];
        int i = 0;
        while(n > 0){
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }
        for(int j=i-1; j>=0; j--){
            System.out.print(binary[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        DecimalToBinary dtb = new DecimalToBinary();
        dtb.convertToBinary(n);

        sc.close();
    }
}
