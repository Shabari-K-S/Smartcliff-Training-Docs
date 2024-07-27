package com.hands_on;

import java.util.Comparator;
import java.util.PriorityQueue;

class CustomCharComparator implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o2 - o1;
    }
}

public class PriorityQueueCharPractice {
    public static void main(String[] args) {
        // Initialize a Priority Queue object named "charQueue" where elements are ordered based on their ASCII values
        PriorityQueue<Character> charQueue = new PriorityQueue<>(new CustomCharComparator());

        // Add characters to the charQueue: 'a', 'b', 'c', 'd'
        charQueue.add('a');
        charQueue.add('b');
        charQueue.add('c');
        charQueue.add('d');

        // Remove the head element from the charQueue
        Character headElement = charQueue.poll();
        System.out.println("Head element: " + headElement);

        // Peek at the head element of the charQueue without removing it
        Character peekElement = charQueue.peek();
        System.out.println("Peek element: " + peekElement);

        // Check whether the charQueue is empty
        boolean isEmpty = charQueue.isEmpty();
        System.out.println("Is charQueue empty? " + isEmpty);

        // Determine and print the size of the charQueue
        int size = charQueue.size();
        System.out.println("Size of charQueue: " + size);

        // Iterate through the elements of the charQueue and print each element
        System.out.print("Elements of charQueue:");
        for (Character element : charQueue) {
            System.out.print(element+" ");
        }

        // Convert the charQueue into an array and print the resulting array
        Character[] charArray = charQueue.toArray(new Character[0]);
        System.out.print("\nConverted array:");
        for (Character element : charArray) {
            System.out.print(element+" ");
        }

        // Clear all elements from the charQueue
        charQueue.clear();

        // Verify whether the charQueue is empty after clearing
        System.out.println("\nIs charQueue empty after clearing? " + charQueue.isEmpty());
    }
}