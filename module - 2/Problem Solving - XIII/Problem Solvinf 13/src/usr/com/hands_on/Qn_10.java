package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

public class Qn_10 {
    public static BTNode<Integer> lowestCommonAncestor(BTNode<Integer> root, int p, int q) {
        if (root == null || root.data == p || root.data == q) return root;
        BTNode<Integer> left = lowestCommonAncestor(root.left, p, q);
        BTNode<Integer> right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        else if (left != null) return left;
        else return right;

    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the Binary Tree: ");
        String[] str = sc.nextLine().split(" ");
        for(String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        System.out.println("Enter the value of P and Q: ");
        str = sc.nextLine().split(" ");
        System.out.println(lowestCommonAncestor(bt.getRoot(),Integer.parseInt(str[0]),Integer.parseInt(str[1])).data);
    }
}
