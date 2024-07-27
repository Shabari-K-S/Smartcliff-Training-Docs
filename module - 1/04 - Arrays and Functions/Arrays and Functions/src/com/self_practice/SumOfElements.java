package com.self_practice;

import java.util.Scanner;

public class SumOfElements {
    public int findSum(int n, int[] arr, int a, int b){
        int sum = 0;
        boolean skip = false;
        for(int i=0; i<n; i++){
            if(arr[i] == a){
                skip = true;
            }else if(arr[i] == b){
                skip = false;
            }else if(!skip){
                sum += arr[i];
            }
        }
        return sum;
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

        System.out.print("Enter the element a: ");
        int a = sc.nextInt();
        System.out.print("Enter the element b: ");
        int b = sc.nextInt();

        SumOfElements soe = new SumOfElements();
        int sum = soe.findSum(n, arr, a, b);
        System.out.println(sum);

        sc.close();
    }
}