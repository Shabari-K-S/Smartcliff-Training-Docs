package usr.hands_on;

import usr.collections.BST;

import java.util.Scanner;

public class Qn_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<Integer> bst = new BST<Integer>();
        System.out.println("Enter the values of the tree: ");
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        for (String str1 : strs) {
            bst.insert(Integer.parseInt(str1));
        }
        bst.display();

        System.out.println("The Minimum values in BST are: " + bst.getMin());
    }
}
