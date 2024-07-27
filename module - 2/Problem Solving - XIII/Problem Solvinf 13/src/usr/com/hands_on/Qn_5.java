package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

public class Qn_5 {
    public static int toSumTree(BTNode<Integer> node) {
        if (node == null)
            return 0;
        int old_val = node.data;
        node.data = toSumTree(node.left) + toSumTree(node.right);
        return node.data + old_val;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of tree: ");
        String[] str = sc.nextLine().split(" ");
        for(String s : str ) {
            bt.insert(Integer.parseInt(s));
        }
        toSumTree(bt.getRoot());
        bt.display();
    }
}
