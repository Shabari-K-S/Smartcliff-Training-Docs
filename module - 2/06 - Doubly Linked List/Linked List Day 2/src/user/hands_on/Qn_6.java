package user.hands_on;

import user.collection.CircularLinkedListADT;

import java.util.Scanner;

public class Qn_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedListADT<Integer> list = new CircularLinkedListADT<>();
        System.out.println("Enter the elements in the list: (Ends with -1) ");
        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            list.add(val);
        }
        sc.close();
        list.display();
    }
}
