package com.hands_on;

import java.util.Scanner;

public class NumberFrequency {
    public void findFrequency(int[] arr, int num){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        System.out.println("The Frequency of "+num+" is: "+count);
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

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        NumberFrequency nf = new NumberFrequency();
        nf.findFrequency(arr, num);

        sc.close();
    }
}