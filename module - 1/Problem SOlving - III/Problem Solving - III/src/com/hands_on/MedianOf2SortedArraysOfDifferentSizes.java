package com.hands_on;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOf2SortedArraysOfDifferentSizes {
    public static void medianOf2SortedArraysOfDifferentSizes(int[] arr1, int[] arr2){
        int[] arrayFinal = new int[arr1.length+arr2.length];
        int l=0;
        for (int j : arr1) {
            arrayFinal[l++] = j;
        }
        for (int j : arr2) {
            arrayFinal[l++] = j;
        }
        Arrays.sort(arrayFinal);
        if (arrayFinal.length%2 != 0){
            System.out.println("The Median of 2 Sorted Array is "+arrayFinal[arrayFinal.length/2]);
        }else{
            double a = (double)arrayFinal.length/2;
            double b = a+1;
            double median = (a+b)/2;
            System.out.println("The Median of 2 Sorted Array is "+median);


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array-1: ");
        int sizeOfArray1 = sc.nextInt();
        System.out.print("Enter the elements of array-1: ");
        int[] array1 = new int[sizeOfArray1];
        for(int i=0;i<sizeOfArray1;i++){
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array-2: ");
        int sizeOfArray2 = sc.nextInt();
        System.out.print("Enter the elements of array-2: ");
        int[] array2 = new int[sizeOfArray2];
        for(int i=0;i<sizeOfArray2;i++){
            array2[i] = sc.nextInt();
        }
        medianOf2SortedArraysOfDifferentSizes(array1,array2);
    }
}
