package com.Main;

import java.util.Arrays;
import java.util.Scanner;

public class CanMakeArithmeticProgressionSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        boolean temp=true;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
                continue;
            }else{
                temp=false;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Ans: " + canMakeArithmeticProgression(arr));
    }
}
