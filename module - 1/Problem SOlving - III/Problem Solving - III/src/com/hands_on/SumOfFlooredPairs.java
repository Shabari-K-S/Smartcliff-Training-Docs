package com.hands_on;

import java.util.Scanner;

public class SumOfFlooredPairs {
    public static int sumOfFlooredPairs(int[] nums){
        int mod = 1000000007;
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] count = new int[max + 1];
        for (int num : nums) {
            count[num]++;
        }
        int[] prefix = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + count[i];
        }
        long res = 0;
        for (int i = 1; i <= max; i++) {
            if (count[i] == 0) {
                continue;
            }
            for (int j = i; j <= max; j += i) {
                res += (long) count[i] * (prefix[Math.min(max, j + i - 1)] - prefix[j - 1]) * (j / i);
            }
        }
        return (int) (res % mod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(sumOfFlooredPairs(nums));
    }
}