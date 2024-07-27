package com.hands_on;

import java.util.*;

public class ReverseSubarrayToMaximizeArrayValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums.add(sc.nextInt());
            }
            System.out.println("The maximum beauty of the array is "+maxBeauty(nums));
        }
    }

    public static int maxBeauty(ArrayList<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += Math.abs(nums.get(i) - nums.get(i-1));
        }
        int max = 0;
        for (int i = 1; i < n - 2; i++) {
            max = Math.max(max, Math.abs(nums.get(i) - nums.get(i - 1)) + Math.abs(nums.get(i + 1) - nums.get(i)) - Math.abs(nums.get(i + 1) - nums.get(i - 1)));
        }
        max = Math.max(max, Math.abs(nums.get(1) - nums.get(0)));
        max = Math.max(max, Math.abs(nums.get(n - 1) - nums.get(n - 2)));
        return sum + max;
    }
}