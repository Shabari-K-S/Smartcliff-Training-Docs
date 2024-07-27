package com.self_practice;

import java.util.Scanner;

public class NumberPatternRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int range = sc.nextInt();
        for(int i=0;i<range;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
