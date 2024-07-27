package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class Qn_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list = new LinkedListADT<>();
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        list.display();
        System.out.println("Reverse of linked list: ");
        list.reverse();
        list.display();
    }
}
