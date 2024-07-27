package searching.methods;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return true;
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

        if (!linearSearch(arr, key)) {
            System.out.println("Element not found");
        }

    }
}
