package sorting.methods;

import java.util.Scanner;

public class InsertionSortString {
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (String str: arr) {
            System.out.print(str + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This part is for String");
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        insertionSort(strArr);
        sc.close();
    }
}
