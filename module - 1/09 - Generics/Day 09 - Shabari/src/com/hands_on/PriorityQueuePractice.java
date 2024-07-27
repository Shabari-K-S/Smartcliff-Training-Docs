package com.hands_on;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        // Initialize a Queue object named "integerQueue" where the elements are ordered based on their natural ordering
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();

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

        // Iterate through the elements of the integerQueue and print each element
        System.out.print("Elements of integerQueue: ");
        for (Integer element : integerQueue) {
            System.out.print(element+" ");
        }

        // Convert the integerQueue into an array and print the resulting array
        Integer[] integerArray = integerQueue.toArray(new Integer[0]);
        System.out.print("\nConverted array: ");
        for (Integer element : integerArray) {
            System.out.print(element+" ");
        }

        // Clear all elements from the integerQueue
        integerQueue.clear();

        // Verify whether the integerQueue is empty after clearing
        System.out.println("\nIs integerQueue empty after clearing? " + integerQueue.isEmpty());
    }
}
