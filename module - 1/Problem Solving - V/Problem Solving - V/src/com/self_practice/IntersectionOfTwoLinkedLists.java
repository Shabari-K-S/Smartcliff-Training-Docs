package com.self_practice;

import java.util.LinkedList;
import java.util.Scanner;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.print("Enter the first list item: ");
        while (true) {
            int a = sc.nextInt();
            if (a == -1)
                break;
            list1.add(a);
        }

        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.print("Enter the second list item: ");
        while (true){
            int b = sc.nextInt();
            if (b == -1)
                break;
            list2.add(b);
        }

        LinkedList<Integer> intersection = new LinkedList<>();
        System.out.print("Enter the intersection of two lists: ");
        while (true) {
            int a = sc.nextInt();
            if (a == -1)
                break;
            intersection.add(a);
        }

        System.out.println("The intersection of two lists is: " + intersection.getFirst());
    }
}
