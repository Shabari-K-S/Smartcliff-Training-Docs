package com.hands_on;

import java.util.Scanner;
import java.util.HashMap;

public class SingleElementSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i: nums){
            if(map.get(i) == 1){
                return i;
            }
        }

        return -1;
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

        System.out.println("The single element in the array: " + singleNonDuplicate(arr));
    }
}