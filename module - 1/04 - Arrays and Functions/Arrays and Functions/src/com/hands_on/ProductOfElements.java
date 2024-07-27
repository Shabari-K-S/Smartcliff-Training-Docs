package com.hands_on;

import java.util.Scanner;

public class ProductOfElements {
    public void findProduct(int[] arr){
        int[] productArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int product = 1;
            for(int j=0; j<arr.length; j++){
                if(i != j){
                    product *= arr[j];
                }
            }
            productArr[i] = product;
        }
        System.out.println("The Product of all other elements: ");
        for(int i=0; i<productArr.length; i++){
            System.out.print(productArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array size: ");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<arraySize; i++){
            arr[i] = sc.nextInt();
        }

        ProductOfElements poe = new ProductOfElements();
        poe.findProduct(arr);

        sc.close();
    }
}