package com.Main;

import java.util.Scanner;

class Pair {
    public int val;
    public int count;
}

public class SortArrayByIncreasingFrequency {


    static void swap(Pair[] arr, int i, int j) {
        Pair temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(Pair[] arr, int low, int high) {
        Pair pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j].count > pivot.count || (arr[j].count == pivot.count && arr[j].val < pivot.val)) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void quicksort(Pair[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    static void sortByFrequency(int[] arr, int n) {
        Pair[] element = new Pair[n];
        for (int i = 0; i < n; i++) {
            element[i] = new Pair();
            element[i].val = arr[i];
            element[i].count = 0;
        }

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                element[i].count++;
            else
                element[j].count++;
        }

        quicksort(element, 0, n - 1);

        for (int i = n - 1, k = 0; i >= 0; i--) {
            for (int j = 0; j < element[i].count; j++)
                arr[k++] = element[i].val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortByFrequency(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
