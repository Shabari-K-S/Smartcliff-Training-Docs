package com.hands_on;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i: candies){
            max = Math.max(max, i);
        }
        for(int i: candies){
            if(i+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
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
        System.out.print("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> result = kidsWithCandies(arr, extraCandies);
        System.out.print("The boolean array: ");
        for(Boolean i: result){
            System.out.print (i+" ");
        }
    }
}