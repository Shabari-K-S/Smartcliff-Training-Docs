package com.hands_on;

import java.util.Scanner;

public class ConsecutiveNumbersSum {
    public static int cosecutiveNumberSum(int num){
        int count = 0;
        for(int i=0;i<num;i++){
            int sum = 0;
            for(int j=i+1;j<num;j++){
                if (sum == num){
                    count += 1;
                }
                sum+= j;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("The count of "+ num +" is "+ cosecutiveNumberSum(num));
    }
}
