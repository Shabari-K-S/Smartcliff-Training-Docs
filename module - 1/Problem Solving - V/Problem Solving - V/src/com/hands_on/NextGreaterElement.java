package com.hands_on;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreaterElement(int[] a) {
        Stack<Integer> stack = new Stack<>();
        stack.push(a[0]);
        System.out.print("The next greater element array: ");
        for(int i=1; i<a.length; i++){
            while(!stack.isEmpty() && stack.peek() < a[i]){
                System.out.print(a[i] + " ");
                stack.pop();
            }
            stack.push(a[i]);
        }
        while(!stack.isEmpty()){
            stack.pop();
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        nextGreaterElement(a);
    }
}