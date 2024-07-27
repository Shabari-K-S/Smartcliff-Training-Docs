package sorting.methods;

import java.util.Scanner;

public class MergeSort {
    public static boolean isSorted(int[] arr) {
        for ( int i = 0; i < arr.length - 1; i++ ) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            if (isSorted(arr))
                return;
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr,m +1,R, 0, n2);

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            }
            else {
                arr[k++] = R[j++];
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.print("\tL : ");
        for ( int a: L) {
            System.out.print(a + " ");
        }

        System.out.format("\n\tR : ");
        for ( int a: R) {
            System.out.format(a + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr,0,n-1);

        System.out.print("The sorted array: [ ");
        for ( int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
