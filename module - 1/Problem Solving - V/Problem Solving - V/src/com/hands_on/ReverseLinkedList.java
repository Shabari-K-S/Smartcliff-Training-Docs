package com.hands_on;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the Linked List: ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (true){
            int a = sc.nextInt();
            if (a == -1)
                break;
            linkedList.add(a);
        }
        System.out.println("Reverse of the Linked List: "+ linkedList.reversed());
    }
}
