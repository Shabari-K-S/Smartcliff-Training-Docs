package usr.hands_on;

import usr.collections.BST;

import java.util.Scanner;

public class Qn_4 {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the tree: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (String s : arr) {
            bst.insert(Integer.parseInt(s));
        }


        bst.display();
        System.out.print("\nIn-Order: ");
        bst.getInOrder();
        System.out.print("\nPre-Order: ");
        bst.getPreOrder();
        System.out.print("\nPost-Order: ");
        bst.getPostOrder();

    }
}
