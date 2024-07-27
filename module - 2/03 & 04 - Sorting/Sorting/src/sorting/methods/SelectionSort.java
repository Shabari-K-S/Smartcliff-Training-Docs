package sorting.methods;

import java.util.Scanner;

public class SelectionSort {
    public static boolean isSorted(int[] arr, int len) {
        boolean flag = true;
        for (int i=0; i<len-1; i++ ) {
            if (arr[i] > arr[i+1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void selectionSortAscending(int[] arr) {
        int len = arr.length;
        System.out.println("==================================================");
        System.out.println("==============  Ascending Order   ================");
        System.out.println("==================================================");


        System.out.println("The Sorting steps: ");
        System.out.println("==================================================");
        for (int i = 0; i < len - 1; i++) {
            if (isSorted(arr,len))
                break;
            System.out.println("Pass " + (i+1));
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                for (int k: arr) {
                    System.out.print("\t" + k + " ");
                }
                System.out.println();
            }

        }
        System.out.println("==================================================");

        System.out.print("The sorted array: [ ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void selectionSortDescending(int[] arr) {
        int len = arr.length;
        System.out.println("==================================================");
        System.out.println("=============  Descending Order   ================");
        System.out.println("==================================================");
        System.out.println("The Sorting steps: ");
        System.out.println("==================================================");
        for (int i = 0; i < len - 1; i++) {
            System.out.println("Pass " + (i+1));
            for (int j = i + 1; j < len; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                for (int k: arr) {
                    System.out.print("\t" + k + " ");
                }
                System.out.println();
            }

        }
        System.out.println("==================================================");

        System.out.print("The sorted array: [ ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Selction Sort");
        System.out.println("==================================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int []arr2 = arr;
        selectionSortAscending(arr);
        selectionSortDescending(arr2);
        sc.close();
    }
}


/*
    7 9 4 1 3

    1 -> 7 | 9                  => 7 > 9 = false
    2 -> 7 | 9 4                => 7 > 4 = true   => 4 9 7 1 3
    3 -> 4 | 9 7 1              => 4 > 1 = true   => 1 9 7 4 3
    4 -> 1 | 9 7 4 3            => 1 > 3 = false

    1 9 7 4 3

    1 -> 1 9 | 7                => 9 > 7 = true   => 1 7 9 4 3



 */