package com.hands_on;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeuePractice {
    public static void main(String[] args) {
        // Initialize an ArrayDeque object named "integerDeque" to store integers
        ArrayDeque<Integer> integerDeque = new ArrayDeque<>();

        // Add integers to the integerDeque: 12, 24, 45, 67, 87, 43
        integerDeque.add(12);
        integerDeque.add(24);
        integerDeque.add(45);
        integerDeque.add(67);
        integerDeque.add(87);
        integerDeque.add(43);

        // Add the integer 100 to the beginning of the integerDeque
        integerDeque.addFirst(100);

        // Add the integer 200 to the end of the integerDeque
        integerDeque.addLast(200);

        // Remove and retrieve the first element from the integerDeque
        Integer firstElement = integerDeque.pollFirst();
        System.out.println("First element: " + firstElement);

        // Remove and retrieve the last element from the integerDeque
        Integer lastElement = integerDeque.pollLast();
        System.out.println("Last element: " + lastElement);

        // Retrieve, but not remove, the first element of the integerDeque
        Integer first = integerDeque.peekFirst();
        System.out.println("First element (without removing): " + first);

        // Retrieve, but not remove, the last element of the integerDeque
        Integer last = integerDeque.peekLast();
        System.out.println("Last element (without removing): " + last);

        // Retrieve an element from the integerDeque at a random index and print it
        Iterator<Integer> iterator = integerDeque.iterator();
        Integer randomElement = null;
        if (iterator.hasNext()) {
            randomElement = iterator.next();
        }
        System.out.println("Random element: " + randomElement);

        // Check whether the integerDeque is empty
        boolean isEmpty = integerDeque.isEmpty();
        System.out.println("Is integerDeque empty? " + isEmpty);

        // Determine and print the size of the integerDeque
        int size = integerDeque.size();
        System.out.println("Size of integerDeque: " + size);

        // Add the integers 300, 400, 500, 600, 700, 800, 900 to the integerDeque
        for (int i = 300; i <= 900; i += 100) {
            integerDeque.add(i);
        }

        // Remove several elements from the integerDeque
        integerDeque.remove(300);
        integerDeque.remove(400);
        integerDeque.remove(500);

        // Iterate through the elements of the integerDeque and print each element
        System.out.print("Elements of integerDeque: ");

        for (Integer element : integerDeque) {
            System.out.print(element + " ");
        }

        // Convert the integerDeque into an array and print the resulting array
        Integer[] integerArray = integerDeque.toArray(new Integer[0]);
        System.out.print("\nConverted array: ");
        for (Integer element : integerArray) {
            System.out.print(element + " ");
        }

        // Clear all elements from the integerDeque
        integerDeque.clear();

        // Verify whether the integerDeque is empty after clearing
        System.out.println("\nIs integerDeque empty after clearing? " + integerDeque.isEmpty());

    }
}