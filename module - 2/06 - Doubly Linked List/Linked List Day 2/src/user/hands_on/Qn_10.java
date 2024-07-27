package user.hands_on;

import user.collection.CircularLinkedListADT;

import java.util.Scanner;

public class Qn_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedListADT<Integer> list = new CircularLinkedListADT<>();
        System.out.println("Enter the element of the Doubly linked List: (End with -1)");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) {
                break;
            }
            list.add(val);
        }
        System.out.println("Before Deletion");
        list.display();
        System.out.println("After deletion");
        list.remove();
        list.display();
    }
}
