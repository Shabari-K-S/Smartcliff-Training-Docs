package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class Qn_3 {
    public static void main(String[] args) {
        LinkedListADT<Integer> list = new LinkedListADT<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element and position for insertion :");
        int ele = sc.nextInt();
        int pos = sc.nextInt();
        list.add(ele, pos);
        System.out.println("List after insertion : ");
        list.display();
        sc.close();
    }
}
