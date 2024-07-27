package com.hands_on;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Queue: ");
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the elements of the Queue: ");
        for(int i=0; i<n; i++){
            queue.add(sc.nextInt());
        }
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for(int i=0; i<n-k; i++){
            queue.add(queue.poll());
        }
        System.out.println("The Queue after reversing the first K elements: " + queue);
    }
}