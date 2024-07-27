package user.hands_on;

import user.collection.DoublyLinkedListADT;

import java.util.Scanner;

public class Qn_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedListADT<Integer> list = new DoublyLinkedListADT<>();
        System.out.println("Enter the number of querys: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the element of the Doubly linked List: (End with -1)");
            while (true) {
                int val = sc.nextInt();
                if (val == -1) {
                    break;
                }
                list.add(val);
            }
            list.display();
            System.out.println("Enter the element and position of the node: ");
            int ele = sc.nextInt();
            int pos = sc.nextInt();
            list.add(ele, pos);
            System.out.println("After insertion: ");
            list.display();
        }
    }
}
