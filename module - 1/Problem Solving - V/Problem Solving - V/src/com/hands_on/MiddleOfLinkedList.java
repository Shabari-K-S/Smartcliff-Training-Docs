package com.hands_on;

import java.util.LinkedList;
import java.util.Scanner;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Linked List: ");
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter the elements of the Linked List: ");
        for (int i = 0; i < n; i++){
            linkedList.add(sc.nextInt());
        }
        int mid = (n)/2;
        System.out.print("The Linked List after the middle node: ");
        for ( int i = mid; i < n; i++) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}