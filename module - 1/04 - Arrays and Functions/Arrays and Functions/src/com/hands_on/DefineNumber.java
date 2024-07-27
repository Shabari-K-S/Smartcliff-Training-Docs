package com.hands_on;

import java.util.Scanner;

public class DefineNumber {
    public void countPositive(int[] arr){
        int positive = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                positive++;
            }
        }
        System.out.println("Count of positive number: "+positive);
    }

    public void countNegative(int[] arr){
        int negative = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                negative++;
            }
        }
        System.out.println("Count of negative number: "+negative);
    }

    public void countOdd(int[] arr){
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                odd++;
            }
        }
        System.out.println("Count of odd number: "+odd);
    }

    public void countEven(int[] arr){
        int even = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
        }
        System.out.println("Count of even number: "+even);
    }

    public void countZero(int[] arr){
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        System.out.println("Count of zero: "+zero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array size: ");
        int arraySize = sc.nextInt();
        System.out.print("Enter the Array Elements: ");
        int[] arr = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }

        DefineNumber dn = new DefineNumber();
        dn.countPositive(arr);
        dn.countNegative(arr);
        dn.countOdd(arr);
        dn.countEven(arr);
        dn.countZero(arr);

        sc.close();
    }
}