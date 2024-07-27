package com.hands_on;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] subset = { 1, 2, 3, 4 };

        boolean found = false;
        for (int i = 0; i < subset.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == subset[i] && found == false) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
        }
        System.out.println(found);
    }
}
