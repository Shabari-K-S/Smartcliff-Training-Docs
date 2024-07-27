package com.hands_on;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }

        for(int i: nums2){
            set2.add(i);
        }

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int i=0;
        for(int num: set1){
            result[i++] = num;
        }

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

        int[] result = intersection(nums1, nums2);
        System.out.print("Intersection of the two arrays: ");
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}