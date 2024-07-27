/*
 *   Question:
 *      In the array the value of array is need to be equal to
 *      the value of the array indexing ?
 *
 *   Example :
 *      arr[0] = 0
 *      arr[1] = 1
 *      arr[2] = 2
 *
 *   Algorithm :
 *      findMax(arr) -> int:
 *          max -> the lowest value;
 *          for i from 0 to len(arr):
 *              if arr[i] > max
 *                  set max -> arr[i]
 *          return max
 *
 *      sort(arr) -> int[]:
 *          create arr2 to size findMax(arr)
 *          for i from 0 to len(arr2):
 *              set arr2[i] -> -1
 *          for i from 0 to len(arr):
 *              set arr2[arr[i]] -> arr[i]
 *          return arr2
 *
 */

package problems;

import java.util.Arrays;
import java.util.Scanner;

public class Qn_1 {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int[]  sort(int[] arr) {
        int[] arr2 = new int[findMax(arr)+1];
        Arrays.fill(arr2, -1);
        for(int i: arr) {
            if (i == -1)
                continue;
            arr2[i] = i;
        }
        return arr2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = sort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
