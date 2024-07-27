package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class Qn_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> linkedList = new LinkedListADT<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }
        sc.close();
        linkedList.display();
    }
}
