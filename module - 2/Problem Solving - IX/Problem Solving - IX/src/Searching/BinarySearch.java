package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("The element at index " + arr[mid] + " is found at index " + mid);
                return true;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to search: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements you want to search: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search: ");
        int key = sc.nextInt();

        if (isSorted(arr)) {
            if (!binarySearch(arr, key)) {
                System.out.println("Element not found");
            }
        } else {
            System.out.println("Give me the sorted array.");
        }
    }
}
