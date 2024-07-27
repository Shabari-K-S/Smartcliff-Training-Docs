package com.hands_on;

import java.util.Scanner;

public class MissingElement {
    public int findMissingElement(int n, int[] arr){
        int sum = n*(n+1)/2;
        int sumArr = 0;
        for(int i=0; i<arr.length; i++){
            sumArr += arr[i];
        }
        return sum - sumArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer range: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }

        MissingElement me = new MissingElement();
        int missingElement = me.findMissingElement(n, arr);
        System.out.println("The Missing Element is: "+missingElement);

        sc.close();
    }
}