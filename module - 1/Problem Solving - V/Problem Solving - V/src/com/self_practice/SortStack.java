package com.self_practice;

import java.util.Stack;
import java.util.Scanner;

public class SortStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter the elements of the stack: ");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insert(stack, temp);
        }
    }

    public static void insert(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
        } else {
            int val = stack.pop();
            insert(stack, temp);
            stack.push(val);
        }
    }
}