package com.hands_on;

import java.util.Scanner;

public class ButterFlyPattern  {
    public static void butterflyPattern(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int k=num-1; k>i; k-- ){
                System.out.print("  ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num -1;i>=0;i--){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int k=num-1; k>i; k-- ){
                System.out.print("  ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        butterflyPattern(num);
    }
}
