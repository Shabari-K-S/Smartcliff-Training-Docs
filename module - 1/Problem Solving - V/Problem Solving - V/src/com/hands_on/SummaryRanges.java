package com.hands_on;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int i=0, j=0;
        while(j<nums.length){
            if(j+1 < nums.length && nums[j+1] == nums[j]+1){
                j++;
            }else{
                if(i == j){
                    result.add(Integer.toString(nums[i]));
                }else{
                    result.add(nums[i] + "->" + nums[j]);
                }
                j++;
                i=j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<String> result = summaryRanges(arr);
        System.out.println("The list of ranges: ");
        for(String i: result){
            System.out.println(i);
        }
    }
}