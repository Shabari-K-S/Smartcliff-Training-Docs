package com.hands_on;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
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
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                if (maxHeap.isEmpty() || arr[i] < maxHeap.peek()) {
                    maxHeap.add(arr[i]);
                } else {
                    minHeap.add(arr[i]);
                }
                if (maxHeap.size() > minHeap.size() + 1) {
                    minHeap.add(maxHeap.poll());
                } else if (minHeap.size() > maxHeap.size()) {
                    maxHeap.add(minHeap.poll());
                }
                if (maxHeap.size() == minHeap.size()) {
                    System.out.print((maxHeap.peek() + minHeap.peek()) / 2 + " ");
                } else {
                    System.out.print(maxHeap.peek() + " ");
                }
            }
            System.out.println();
        }
    }
}