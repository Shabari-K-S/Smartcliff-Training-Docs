package com.hands_on;

import java.util.HashSet;
import java.util.Scanner;

public class FindTheDifferenceOfTwoArrays {
    public static int[][] findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }

        for(int i: nums2){
            set2.add(i);
        }

        HashSet<Integer> diff1 = new HashSet<>(set1);
        HashSet<Integer> diff2 = new HashSet<>(set2);

        diff1.removeAll(set2);
        diff2.removeAll(set1);

        int[][] result = new int[2][];
        result[0] = diff1.stream().mapToInt(Integer::intValue).toArray();
        result[1] = diff2.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for(int i=0; i<m; i++){
            nums2[i] = sc.nextInt();
        }

        int[][] result = findDifference(nums1, nums2);
        System.out.println("Difference of the two arrays: ");
        for(int i=0; i<2; i++){
            for(int j: result[i]){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}