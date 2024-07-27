package sorting.methods;

import java.util.Scanner;

public class BubbleSortString {
    public static void bubbleSort(String[] arr) {
        int len = arr.length;
        boolean flag = false;

        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len - 1; j++) {
                if ( arr[j].compareTo(arr[j+1]) > 0) {
                    flag = true;
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
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
        bubbleSort(strArr);
        sc.close();
    }
}
