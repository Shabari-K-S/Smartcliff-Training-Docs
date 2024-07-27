package com.hands_on;

import java.util.HashMap;
import java.util.Scanner;

public class SettleDebt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[][] transactions = new int[n][3];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    transactions[i][j] = sc.nextInt();
                }
            }
            System.out.println("The minimum number of transactions required to settle the debt is "+minTransfers(transactions));
        }
    }

    public static int minTransfers(int[][] transactions) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] transaction : transactions) {
            map.put(transaction[0], map.getOrDefault(transaction[0], 0) - transaction[2]);
            map.put(transaction[1], map.getOrDefault(transaction[1], 0) + transaction[2]);
        }
        return settleDebt(0, map);
    }

    public static int settleDebt(int start, HashMap<Integer, Integer> map) {
        while (start < map.size() && map.get(start) == 0) {
            start++;
        }
        if (start == map.size()) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i < map.size(); i++) {
            if (map.get(start) * map.get(i) < 0) {
                map.put(i, map.get(i) + map.get(start));
                min = Math.min(min, 1 + settleDebt(start + 1, map));
                map.put(i, map.get(i) - map.get(start));
            }
        }
        return min;
    }
}