package searching.methods;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static boolean isSorted(int[] arr) {
        return BinarySearch.isSorted(arr);
    }

    public static boolean binarySearch(int[] arr, int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("The element at index " + arr[mid] + " is found at index " + mid);
                return true;
            } else if (arr[mid] > key) {
                binarySearch(arr, key, low, mid - 1);
            } else if (arr[mid] < key) {
                binarySearch(arr, key, mid + 1, high);
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
            if (!binarySearch(arr, key,0,arr.length-1)) {
                System.out.println("Element not found");
            }
        } else {
            System.out.println("Give me the sorted array.");
        }
    }
}
