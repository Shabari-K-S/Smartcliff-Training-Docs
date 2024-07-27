package com.hands_on.Question9;

public class Main {
    public static void main(String[] args) {
        ArrayOverloading array = new ArrayOverloading();
        int[] arr = {1, 2, 3, 4, 5};
        array.processArray(arr);
        array.processArray(arr, 1);
        array.processArray(arr, 2);
        array.processArray(arr, 5);
    }
}
