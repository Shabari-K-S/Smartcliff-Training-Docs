package sorting.methods;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;
        System.out.println("====================================================");
        System.out.println("=============   Ascending Order   ==================");
        System.out.println("====================================================");
        System.out.println("The Sorting steps: ");
        System.out.println("====================================================");
        for (int i = 1; i < n; ++i) {
            System.out.println("Pass " + i);
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            for (int k: arr) {
                System.out.print("\t" + k + " ");
            }
            System.out.println();
        }
        System.out.println("===================================================");
        System.out.print("The Array Sorted in Ascending Order : [ ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        System.out.println("===================================================");
        System.out.println("=============  Descending Order   =================");
        System.out.println("===================================================");

        System.out.println("The Sorting steps: ");
        System.out.println("====================================================");
        for (int i = 1; i < n; ++i) {
            System.out.println("Pass " + i);
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            for (int k: arr) {
                System.out.print("\t" + k + " ");
            }
            System.out.println();
        }
        System.out.println("====================================================");
        System.out.print("The Array Sorted in Descending Order : [ ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        System.out.println("==================================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = arr;
        insertionSortAscending(arr);
        insertionSortDescending(arr2);
        sc.close();
    }
}

/*

    4 1 3 6
    0 1 2 3

    1 ->  4 | 1                 => key = arr[i]
                                => j >= 0 && arr[j] > key
                                => 1>=0  = t && 4 > 1 = t
                                => arr[j] = arr[i] => 1 1 3 6
                                => j-=1

                                => arr[j] = key    => 1 4 3 6

    2 -> 1 4 | 3                =>
 */
