package user.menuapp;

import user.collection.DoublyLinkedListADT;

import java.util.Scanner;

public class DoublyLinkedListMenuApp {
    // global values
    static Scanner sc = new Scanner(System.in);
    static DoublyLinkedListADT<Integer> list = new DoublyLinkedListADT<>();

    // options
    public static void options() {
        System.out.println(" Doubly Linked List Operations\b");
        System.out.println(" ============================== \n");
        System.out.println("\t1. Insertion at beginning of list");
        System.out.println("\t2. Insertion at end of list");
        System.out.println("\t3. Insertion at specific position of list");
        System.out.println("\t4. Deletion at beginning of list");
        System.out.println("\t5. Deletion at end of list");
        System.out.println("\t6. Deletion at specific position of list");
        System.out.println("\t7. Size of the List");
        System.out.println("\t8. Is the list empty?");
        System.out.println("\t9. Display the list");
        System.out.println("\t10. Exit");
        System.out.println();
    }
    public static void main(String[] args) {
        outer:
        while (true) {
            options();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element need to be inserted: ");
                    list.add(sc.nextInt(), 0);
                    break;
                case 2:
                    System.out.print("Enter the element need to be inserted: ");
                    list.add(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter the element need to be inserted: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter the position need to be inserted: ");
                    int pos = sc.nextInt();
                    list.add(ele, pos);
                    break;
                case 4:
                    int r = list.remove(0);
                    System.out.println("The First element is removed that is " + r);
                    break;
                case 5:
                    int re = list.remove();
                    System.out.println("The Last element is removed that is" + re);
                    break;
                case 6:
                    System.out.println("Enter the position of that value would you like to delete: ");
                    int posi = sc.nextInt();
                    int rem = list.remove(posi);
                    System.out.println("The Element " + rem + " is removed from the list.");
                    break;
                case 7:
                    System.out.println("The size of the List is " + list.size());
                    break;
                case 8:
                    System.out.println("Is the list empty? " + (list.isEmpty()? "Yes": "No"));
                    break;
                case 9:
                    System.out.println("The List contain these elements :- ");
                    System.out.print("\n\t");
                    list.display();
                    System.out.println();
                    break;
                case 10:
                    break outer;
                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("Exiting the Doubly Linked List Operations Program...\b");
    }
}
