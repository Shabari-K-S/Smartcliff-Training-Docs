package usr.com.hands_on;

import usr.pkg.collection.BinaryTree;
import usr.pkg.collection.BTNode;

import java.util.Objects;
import java.util.Scanner;


public class Qn_1{
    public static boolean isSymmetric(BTNode<Integer> root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(BTNode<Integer> node1, BTNode<Integer> node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        return Objects.equals(node1.data, node2.data) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the Binary Tree: ");
        String[] str = sc.nextLine().split(" ");
        for(String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();

        System.out.println(isSymmetric(bt.getRoot()));
    }
}
