package com.hands_on;

import java.util.Scanner;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean checkIfTwoStringArraysAreEquivalent(String[] str1, String[] str2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(String s: str1){
            a.append(s);
        }
        for(String s: str2){
            b.append(s);
        }
        return a.toString().contentEquals(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array-1: ");
        String[] array1 = new String[size];
        for(int i=0;i<size; i++){
            array1[i] = sc.next();
        }
        System.out.println("Enter the elements of array-2: ");
        String[] array2 = new String[size];
        for(int i=0;i<size; i++){
            array2[i] = sc.next();
        }
        System.out.println(checkIfTwoStringArraysAreEquivalent(array1,array2));
    }
}
