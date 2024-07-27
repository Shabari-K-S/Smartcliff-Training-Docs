package com.hands_on;

import user.collection.LinkedListADT;

import java.util.LinkedList;
import java.util.Scanner;

public class SortingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list = new LinkedListADT<>();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the linked list: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println("Before Sorting: ");
        System.out.print("\t");
        list.display();
        System.out.println("After Sorting: ");
        System.out.print("\t");
        list.sort();
        list.display();
    }
}
