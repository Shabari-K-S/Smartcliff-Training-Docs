package com.hands_on;

import java.util.Comparator;
import java.util.PriorityQueue;


class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class CustomPriorityQueuePractice {
    public static void main(String[] args) {
        // Initialize a Priority Queue object named "integerQueue" where elements are ordered specified by a custom Comparator
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>(new CustomComparator());

        // Add integers to the integerQueue: 10, 20, 30, 40
        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        integerQueue.add(40);

        // Remove the head element from the integerQueue
        Integer headElement = integerQueue.poll();
        System.out.println("Head element: " + headElement);

        // Peek at the head element of the integerQueue without removing it
        Integer peekElement = integerQueue.peek();
        System.out.println("Peek element: " + peekElement);

        // Check whether the integerQueue is empty
        boolean isEmpty = integerQueue.isEmpty();
        System.out.println("Is integerQueue empty? " + isEmpty);

        // Determine and print the size of the integerQueue
        int size = integerQueue.size();
        System.out.println("Size of integerQueue: " + size);

        // Clear all elements from the integerQueue
        integerQueue.clear();

        // Verify whether the integerQueue is empty after clearing
        System.out.println("Is integerQueue empty after clearing? " + integerQueue.isEmpty());
    }
}
