package user.hands_on;

import user.collection.DoublyLinkedListADT;

import java.util.Scanner;

public class Qn_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedListADT<Integer> list = new DoublyLinkedListADT<>();
        System.out.println("Enter the element of the Doubly linked List: (End with -1)");
        while(true) {
            int val = sc.nextInt();
            if(val == -1) {
                break;
            }
            list.add(val);
        }
        System.out.print("The Doubly Linked List is:\n\t");
        list.display();
    }
}
