package sorting.methods;

import java.util.Scanner;

public class QuickSort {
    // colors for text in console
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static int count = 0;

    // swapping method
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    //quick sort method for Ascending
    public static void quickSortAscending(int[] arr, int left, int right) {
        if (left < right) {
            // partition and swapping
            int pivot = arr[right];

            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            int pi = i + 1;
            swap(arr, pi, right);
            System.out.print(ANSI_CYAN +"Level " + ++count + ANSI_RESET +":   ");
            for(int k=0; k < arr.length; k++) {
                if (arr[k] == pivot) {
                    System.out.print(ANSI_RED + arr[k] + " " +ANSI_RESET);
                } else if (k >= left && k <= right) {
                    System.out.print(ANSI_GREEN + arr[k] + " " +ANSI_RESET);
                } else {
                    System.out.print(arr[k] + " " + ANSI_RESET);
                }
            }
            System.out.println();

            // recursion
            quickSortAscending(arr, left, pi - 1);
            quickSortAscending(arr, pi + 1, right);
        }

    }

    public static void quickSortDescending(int[] arr, int left, int right) {
        if (left < right) {
            // partition and swapping
            int pivot = arr[right];

            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (arr[j] > pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            int pi = i + 1;
            swap(arr, pi, right);
            
            System.out.print(ANSI_CYAN + "Level " + ++count + ANSI_RESET + ":   ");
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == pivot) {
                    System.out.print(ANSI_RED + arr[k] + " " + ANSI_RESET);
                } else if (k >= left && k <= right) {
                    System.out.print(ANSI_GREEN + arr[k] + " " + ANSI_RESET);
                } else {
                    System.out.print(arr[k] + " " + ANSI_RESET);
                }
            }
            System.out.println();

            // recursion
            quickSortDescending(arr, left, pi - 1);
            quickSortDescending(arr, pi + 1, right);
        }
    }
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for ( int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }


        System.out.println(ANSI_CYAN + "========================================================");
        System.out.println(ANSI_CYAN + "=====================  Quick Sort ======================");
        System.out.println(ANSI_CYAN + "========================================================" + ANSI_RESET);

        System.out.println(
                 "The Part Swapping take place -> " + ANSI_GREEN + "Green\n" + ANSI_RESET
                        + "Pivot -> " + ANSI_RED + "Red" + ANSI_RESET
        );
        quickSortAscending(arr,0,n-1);

        System.out.print("The Ascending Ordered array: [ ");
        for ( int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        // resetting the level
        count = 0;

        quickSortDescending(arr2,0,n-1);


        System.out.print("The Descending Ordered array: [ ");
        for ( int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        sc.close();
    }
}
