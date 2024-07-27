package com.hands_on;

import java.util.Scanner;

public class RemoveDuplicates {
    public void removeDuplicates(int[] arr){
        int[] uniqueArr = new int[arr.length];
        int k = 0;
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                uniqueArr[k++] = arr[i];
            }
        }
        System.out.println("Array after removing duplicates: ");
        for(int i=0; i<k; i++){
            System.out.print(uniqueArr[i]+" ");
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

        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removeDuplicates(arr);

        sc.close();
    }
}