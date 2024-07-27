package com.hands_on;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        // Initialize a Stack named "integerStack" to store integer values
        Stack<Integer> integerStack = new Stack<>();

        // Push integers onto the integerStack: 10, 20, 30, 40
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);

        // Pop the top element from the integerStack
        Integer poppedElement = integerStack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Peek at the top element of the integerStack without removing it
        Integer topElement = integerStack.peek();
        System.out.println("Top element (without removing): " + topElement);

        // Search for the integer 30 in the integerStack and print its position relative to the top of the stack
        int position = integerStack.search(30);
        System.out.println("Position of 30 relative to top: " + position);

        // Check whether the integerStack is empty and print the result
        boolean isEmpty = integerStack.isEmpty();
        System.out.println("Is integerStack empty? " + isEmpty);

        // Print the current size of the integerStack
        int size = integerStack.size();
        System.out.println("Size of integerStack: " + size);

        // Determine and print the capacity of the integerStack
        int capacity = integerStack.capacity(); // Not directly accessible, as Stack extends Vector
        System.out.println("Capacity of integerStack: " + capacity);

        // Iterate through the elements of the integerStack using a for-each loop and print each element
        System.out.println("Elements of integerStack:");
        for (Integer element : integerStack) {
            System.out.println(element);
        }

        // Convert the integerStack into an array and print the resulting array
        Integer[] integerArray = integerStack.toArray(new Integer[0]);
        System.out.println("Converted array:");
        for (Integer element : integerArray) {
            System.out.println(element);
        }

        // Clear all elements from the integerStack
        integerStack.clear();

        // Verify whether the integerStack is empty after clearing
        System.out.println("Is integerStack empty after clearing? " + integerStack.isEmpty());
    }
}
