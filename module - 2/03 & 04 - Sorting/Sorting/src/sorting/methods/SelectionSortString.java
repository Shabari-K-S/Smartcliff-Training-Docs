package sorting.methods;

import java.util.Scanner;

public class SelectionSortString {
    public static void selectionSort(String[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (String k: arr) {
            System.out.print(k + " ");
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
        selectionSort(strArr);
        sc.close();
    }
}
