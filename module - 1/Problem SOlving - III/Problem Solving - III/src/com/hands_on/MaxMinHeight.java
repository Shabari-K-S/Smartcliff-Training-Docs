package com.hands_on;

import java.util.Scanner;

public class MaxMinHeight {
    private static long maxMinHeight(int n, int k, int w, int[] a) {
        int high = Integer.MAX_VALUE / 4;
        int low = 0;
        long ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(a , w , mid , k)){
                low = mid + 1;
                ans = (long)Math.max((long)mid , ans);
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr , int l , int maxHeight , int days){
        int[] water = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            if(i > 0){
                water[i] = water[i-1];
            }
            int curHei = water[i] + arr[i];
            if(i >= l){
                curHei -= (water[i-l]);
            }
            if(curHei < maxHeight){
                water[i] += (maxHeight - curHei);
                days -= (maxHeight - curHei);
            }
            if(days < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.print("Enter the value of w: ");
        int w = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(maxMinHeight(n, k, w, a));
    }
}