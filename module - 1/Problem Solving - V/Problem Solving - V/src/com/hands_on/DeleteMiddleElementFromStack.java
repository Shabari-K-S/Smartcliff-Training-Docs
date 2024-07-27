package com.hands_on;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementFromStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Stack: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the elements of the Stack: ");
        for(int i=0; i<n; i++){
            stack.push(sc.nextInt());
        }
        Stack<Integer> temp = new Stack<>();
        int mid = (n+1)/2;
        for(int i=0; i<mid-1; i++){
            temp.push(stack.pop());
        }
        stack.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        System.out.println("The Stack after deleting the middlemost element: " + stack);
    }
}