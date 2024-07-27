package com.hands_on;

import java.util.Scanner;

public class SplitArray {
    public void splitArray(int n, int[] arr){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int avg = sum/n;
        int[] lesserArr = new int[n];
        int[] greaterArr = new int[n];
        int lesserIndex = 0;
        int greaterIndex = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < avg){
                lesserArr[lesserIndex++] = arr[i];
            }else if(arr[i] > avg){
                greaterArr[greaterIndex++] = arr[i];
            }
        }
        System.out.println("Array of elements lesser than average: ");
        for(int i=0; i<lesserIndex; i++){
            System.out.print(lesserArr[i]+" ");
        }
        System.out.println();
        System.out.println("Array of elements greater than average: ");
        for(int i=0; i<greaterIndex; i++){
            System.out.print(greaterArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        SplitArray sa = new SplitArray();
        sa.splitArray(n, arr);

        sc.close();
    }
}