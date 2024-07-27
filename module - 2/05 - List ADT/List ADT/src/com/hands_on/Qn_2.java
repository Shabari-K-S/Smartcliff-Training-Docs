package com.hands_on;

import user.collection.LinkedListADT;

public class Qn_2 {
    public static void main(String[] args) {
        LinkedListADT<Integer> linkedListADT = new LinkedListADT<>();
        linkedListADT.add(1);
        linkedListADT.add(2);
        linkedListADT.add(3);
        linkedListADT.add(4);
        linkedListADT.add(5);
        linkedListADT.add(6);
        linkedListADT.display();
        System.out.println("Size of the linked list is " + linkedListADT.size());
    }
}
