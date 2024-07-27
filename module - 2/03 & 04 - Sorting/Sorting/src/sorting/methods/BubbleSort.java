package sorting.methods;

import java.util.Scanner;

public class BubbleSort {
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
    public static void bubbleSortAscending(int[] arr) {
        int len = arr.length;
        System.out.println("==================================================");
        System.out.println("==============  Ascending Order   ================");
        System.out.println("==================================================");
        System.out.println("The Sorting steps: ");
        System.out.println("==================================================");
        for ( int i = 0; i < len; i++) {
            if (isSorted(arr,len))
                break;
            System.out.println("Pass " + (i + 1));

            for (int j = 0; j < len - 1; j++) {
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print(". ");
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

    public static void bubbleSortDescending(int[] arr) {
        int len = arr.length;
        boolean flag = false;
        System.out.println("==================================================");
        System.out.println("=============  Descending Order   ================");
        System.out.println("==================================================");
        System.out.println("The Sorting steps: ");
        System.out.println("==================================================");
        outerl:
        for ( int i = 0; i < len; i++) {
            System.out.println("Pass " + (i + 1));
            flag = false;

            for (int j = 0; j < len - 1; j++) {
                if ( arr[j] < arr[j+1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print(". ");
                }
                for (int k: arr) {
                    System.out.print("\t" + k + " ");
                }
                System.out.println();
            }
            if (!flag)
                break outerl;
        }
        System.out.print("The sorted array: [ ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
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
        bubbleSortAscending(arr);
        bubbleSortDescending(arr2);
        sc.close();
    }
}
