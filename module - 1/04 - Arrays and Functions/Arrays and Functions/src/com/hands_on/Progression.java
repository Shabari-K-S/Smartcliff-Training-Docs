package com.hands_on;

import java.util.Scanner;

public class Progression {
    public void findProgression(int[] arr){
        boolean isArithmetic = true;
        boolean isGeometric = true;
        for(int i=2; i<arr.length; i++){
            if(arr[i] / arr[i-1] != arr[i-1] / arr[i-2]){
                isGeometric = false;
            }
            if(arr[i] - arr[i-1] != arr[i-1] - arr[i-2]){
                isArithmetic = false;
            }
        }
        if(isGeometric){
            System.out.println("Geometric Progression");
        }else if(isArithmetic){
            System.out.println("Arithmetic Progression");
        }else{
            System.out.println("Random Order");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array size: ");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }

        Progression pr = new Progression();
        pr.findProgression(arr);

        sc.close();
    }
}