package com.hands_onn;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements o array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println( maxProfit(arr));
    }
}
