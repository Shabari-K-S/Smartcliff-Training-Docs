package com.hands_on;

import java.util.*;

public class NinjaJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The number of starting index from which Ninja can reach the end of the array is "+ninjaJump(arr));
        }
    }

    public static int ninjaJump(int[] arr) {
        int n = arr.length;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            int nextGreater = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
            map.put(i, nextGreater);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            int nextSmaller = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
            if (map.get(i) < n && map.get(map.get(i)) < n) {
                res++;
            }
        }
        return res;
    }
}