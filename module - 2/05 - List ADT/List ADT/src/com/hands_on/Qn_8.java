package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class Qn_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list = new LinkedListADT<>();
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of list: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element need to be removed");
        int element = sc.nextInt();
        list.display();
        list.removeValue(element);
        System.out.println("List after removing the element");
        list.display();
    }
}
