package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

public class Qn_9 {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the Binary Tree: ");
        String[] str = sc.nextLine().split(" ");
        for(String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();
        BTNode<Integer> root = bt.getRoot();
        System.out.println();
        while(root != null) {
            System.out.print(root.data+ " ");
            if (root.left != null) root = root.left;
            else root = root.right;
        }
        System.out.println();
    }
}
