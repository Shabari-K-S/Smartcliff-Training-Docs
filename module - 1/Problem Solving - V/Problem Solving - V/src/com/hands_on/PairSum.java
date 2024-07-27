package com.hands_on;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PairSum {
    public static List<List<Integer>> pairSum(int[] arr, int s) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == s){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                result.add(temp);
                i++;
                j--;
            }else if(arr[i]+arr[j] < s){
                i++;
            }else{
                j--;
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
        System.out.print("Enter the sum: ");
        int s = sc.nextInt();

        List<List<Integer>> result = pairSum(arr, s);
        System.out.println("The list of pairs: ");
        for(List<Integer> i: result){
            System.out.println(i);
        }
    }
}