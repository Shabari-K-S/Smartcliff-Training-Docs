package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i=1; i<=nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    result[0] = i;
                }
            }else{
                result[1] = i;
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

        int[] result = findErrorNums(arr);
        System.out.println("The duplicate and the missing number: ");
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}