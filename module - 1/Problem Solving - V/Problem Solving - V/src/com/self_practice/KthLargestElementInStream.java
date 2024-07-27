package com.self_practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElementInStream {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        for(int num : nums)
            minHeap.add(num);
        while(minHeap.size()>k)
            minHeap.poll();
    }

    public int add(int val) {
        if(minHeap.size() < k ){
            minHeap.add(val);
            return minHeap.peek();
        }
        if(val > minHeap.peek()){
            minHeap.add(val);
            minHeap.poll();
            return minHeap.peek();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        KthLargestElementInStream kthLargest = new KthLargestElementInStream(k, arr);
        for (int i = 0; i < n; i++) {
            System.out.println("Kth largest element in the stream: " + kthLargest.add(arr[i]));
        }
    }
}