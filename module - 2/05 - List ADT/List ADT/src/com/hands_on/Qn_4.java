package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class Qn_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list = new LinkedListADT<>();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the element to insert in the middle: ");
        int m = sc.nextInt();
        int mid = (list.size() / 2);
        list.add(m, mid);
        list.display();
    }
}
