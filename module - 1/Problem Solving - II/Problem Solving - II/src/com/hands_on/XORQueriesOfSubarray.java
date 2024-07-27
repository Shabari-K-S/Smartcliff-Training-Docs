package com.hands_on;

import java.util.Scanner;

public class XORQueriesOfSubarray {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] xor = new int[n + 1];
        for (int i = 0; i < n; i++) {
            xor[i + 1] = xor[i] ^ arr[i];
        }
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = xor[queries[i][0]] ^ xor[queries[i][1] + 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        System.out.println("Enter the queries: ");
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        int[] answer = xorQueries(arr, queries);
        System.out.println("The answer is: ");
        for (int i = 0; i < q; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}