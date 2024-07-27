package com.hands_on;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheKWeakestRowsInAMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int[] soldiers = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            soldiers[i] = Arrays.stream(mat[i]).sum();
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < mat.length; i++){
            list.add(i);
        }
        list.sort((a, b) -> soldiers[a] - soldiers[b]);
        for(int i = 0; i < k; i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int[] result = kWeakestRows(arr, k);
        System.out.print("The indices of the k weakest rows: ");
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}