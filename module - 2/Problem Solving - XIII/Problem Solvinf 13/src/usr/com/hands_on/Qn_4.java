package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Objects;
import java.util.Scanner;

public class Qn_4 {
    private static boolean isMirror(BTNode<Integer> node1, BTNode<Integer> node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        return Objects.equals(node1.data, node2.data) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt1 = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the 1st binary tree: ");
        String[] str = sc.nextLine().split(" ");
        for (String s : str) {
            bt1.insert(Integer.parseInt(s));
        }
        BinaryTree<Integer> bt2 = new BinaryTree<>();
        System.out.println("Enter the values of the 2nd binary tree: ");
        str = sc.nextLine().split(" ");
        for (String s : str) {
            bt2.insert(Integer.parseInt(s));
        }

        bt1.display();
        bt2.display();
        System.out.println(isMirror(bt1.getRoot(),bt2.getRoot()));
    }
}
