package com.self_practice;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int table = sc.nextInt();
        for(int i=1;i<=table;i++){
            for(int j=1;j<=10;j++){
                System.out.format("%3d ", i*j);
            }
            System.out.println();
        }
    }
}
