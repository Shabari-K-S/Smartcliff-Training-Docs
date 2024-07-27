package usr.hands_on;

import usr.collections.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<Integer> bst = new BST<Integer>();
        System.out.println("Enter the values of the tree: ");
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        for (String str1 : strs) {
            bst.insert(Integer.parseInt(str1));
        }
        System.out.println("Enter the k position: ");
        int k = sc.nextInt();
        List<Integer> inorder = new ArrayList<Integer>();
        bst.inorderTraversal(bst.getRoot(),inorder);
        int len = inorder.size();
        System.out.println("The Kth Largest element in tree: " + inorder.get(len-k));
    }
}
