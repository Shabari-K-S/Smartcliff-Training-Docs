package com.Main;

import java.util.Scanner;

public class SmallestMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size1 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum =arr[0];
        for(int i = 1;i<n-1;i++) {
            if(arr[i] + 1 == arr[i+1]) {
                sum=sum+arr[i];
            }
            if(arr[i+1]!=arr[i+1]+1) {
                sum=sum+arr[i+1];
                break;
            }
        }
        int c=0;
        for(int i=0;i<n;i++) {
            if(arr[i] == sum) {
                c++;
            }
            if(c==1) {
                sum=sum+1;
                i=0;
                c=0;
            }
        }
        if(c==0) {
            System.out.println(sum);
        }
        else {
            System.out.println(sum);
        }
    }
}