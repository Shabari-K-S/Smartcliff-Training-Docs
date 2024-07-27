package com.self_practice;

import java.util.Scanner;

public class StarPatternInvertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int range = sc.nextInt();
        for(int i=range;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}