package usr.hands_on;

import usr.collections.BST;

import java.util.Scanner;

public class Qn_9 {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the tree: ");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for (String s: strArr) {
            bst.insert(Integer.parseInt(s));
        }
        System.out.print("Before Balancing ");
        bst.display();
        System.out.println("\nAfter Balancing ");
        bst = bst.balanceBST();
        bst.display();
    }
}
