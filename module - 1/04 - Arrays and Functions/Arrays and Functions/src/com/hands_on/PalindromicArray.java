package com.hands_on;

import java.util.Scanner;

public class PalindromicArray {
    public boolean isPalindromic(int n, int[] arr){
        int start = 0;
        int end = n-1;
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
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

        PalindromicArray pa = new PalindromicArray();
        boolean isPalindromic = pa.isPalindromic(n, arr);
        System.out.println(isPalindromic);

        sc.close();
    }
}