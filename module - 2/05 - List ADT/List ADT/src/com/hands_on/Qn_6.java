package com.hands_on;

import user.collection.LinkedListADT;

import java.util.Scanner;

public class Qn_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list = new LinkedListADT<>();

        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        list.display();
        System.out.println("Delete at Specific Position : " );
        System.out.print("Enter the element position: ");
        int pos = sc.nextInt();
        list.remove(pos-1);
        list.display();

    }
}
