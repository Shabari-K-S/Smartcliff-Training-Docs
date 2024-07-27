package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class MergeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list1 = new LinkedListADT<>();
        LinkedListADT<Integer> list2 = new LinkedListADT<>();
        System.out.println("Enter the size of the list-1: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the list-1: ");
        for (int i = 0; i < size; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println("Enter the size of the list-2: ");
        size = sc.nextInt();
        System.out.println("Enter the elements of the list-2: ");
        for (int i = 0; i < size; i++) {
            list2.add(sc.nextInt());
        }
        list1.merge(list2);
        list1.display();
    }
}
