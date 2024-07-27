
/*
Question:  Least Number of Unique Integers after K Removals

    Problem Statement : Given an array of integers arr and an
        integer k. Find the least number of unique integers after
        removing exactly k elements.
    Example 1:
        Input: arr = [5,5,4], k = 1
        Output: 1
        Explanation: Remove the single 4, only 5 is left.
    Example 2:
        Input: arr = [4,3,1,1,3,3,2], k = 3
        Output: 2
        Explanation: Remove 4, 2 and either one of the two 1s or
                     three 3s. 1 and 3 will be left.
 */
package usr.Assessments;

import java.util.Scanner;

public class Qn_4 {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
        for (int j : inputArray) {
            M = Math.max(M, j);
        }
        int[] countArray = new int[M + 1];

        for (int j : inputArray) {
            countArray[j]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }

    public static int leastNumberUniqueIntegersAfterKRemovals(int[] arr, int k) {
        arr = countSort(arr);
        int count = 1;
        for (int i = k; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of arrays: ");
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println("Enter the values of k: ");
        int k = sc.nextInt();
        System.out.println(leastNumberUniqueIntegersAfterKRemovals(arr,k));
    }
}
