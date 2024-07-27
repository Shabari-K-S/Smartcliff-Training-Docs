package com.hands_on;

import java.util.Scanner;

public class PairSum {
    public void findPair(int[] arr){
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == 10){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("-1");
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

        PairSum ps = new PairSum();
        ps.findPair(arr);

        sc.close();
    }
}