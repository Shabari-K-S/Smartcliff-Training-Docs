package com.hands_on;

import user.collection.LinkedListADT;
import java.util.Scanner;

public class Qn_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListADT<Integer> list = new LinkedListADT<>();
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of list: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the elements to be searched: ");
        int element = sc.nextInt();
        int pos = list.search(element);
        System.out.println(element+ " is found at " + pos);
    }
}
