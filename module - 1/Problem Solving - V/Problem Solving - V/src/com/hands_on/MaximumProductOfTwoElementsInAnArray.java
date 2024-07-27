package com.hands_on;

import java.util.Scanner;

public class MaximumProductOfTwoElementsInAnArray {
    public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i: nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }else if(i > max2){
                max2 = i;
            }
        }

        return (max1-1)*(max2-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Maximum product of two elements in the array: " + maxProduct(nums));
    }
}
