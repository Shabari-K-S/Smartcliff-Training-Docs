package com.hands_on;

import java.util.Scanner;

public class ReplaceNumber {
    public void replaceNumbers(int n, int[] arr){
        System.out.println("Array before replacing: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                continue;
            }
            if(arr[i] % 9 == 0){
                arr[i] = 4;
            }else if(arr[i] % 8 == 0){
                arr[i] = 2;
            }else if(arr[i] % 2 == 0){
                arr[i] = 0;
            }else if(arr[i] % 10 == 3){
                arr[i] = 3;
            }else{
                arr[i] = 1;
            }
        }
        System.out.println("Array after replacing: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int[] arr = new int[100];
        int n = 0;
        while(true){
            int num = sc.nextInt();
            if(num < 0){
                break;
            }
            arr[n++] = num;
        }

        ReplaceNumber rn = new ReplaceNumber();
        rn.replaceNumbers(n, arr);

        sc.close();
    }
}