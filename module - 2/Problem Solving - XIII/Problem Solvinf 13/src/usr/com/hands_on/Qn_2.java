package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;


public class Qn_2 {
    static BTNode<Integer> target_leaf = null;
    static int max_no = Integer.MIN_VALUE;

    static boolean printPath(BTNode<Integer> node, BTNode<Integer> target_leaf) {
        if (node == null)
            return false;

        if (node == target_leaf || printPath(node.left, target_leaf)
                || printPath(node.right, target_leaf)) {
            System.out.print(node.data + " ");
            return true;
        }

        return false;
    }

    static void getTargetLeaf(BTNode<Integer> node, int curr_sum) {
        if (node == null)
            return;
        curr_sum = curr_sum + node.data;
        if (node.left == null && node.right == null) {
            if (curr_sum > max_no) {
                max_no = curr_sum;
                target_leaf = node;
            }
        }
        getTargetLeaf(node.left,  curr_sum);
        getTargetLeaf(node.right, curr_sum);
    }
    static void maxSumPath(BTNode<Integer> root) {
        if (root == null)
            return;
        getTargetLeaf(root, 0);
        printPath(root, target_leaf);
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.insert(4);
        BTNode<Integer> root = bt.getRoot();
        root.left = new BTNode<>(-2);
        root.right = new BTNode<>(3);
        root.left.left = new BTNode<>(4);
        root.left.left.right = new BTNode<>(3);
        root.right.left = new BTNode<>(5);
        root.right.right = new BTNode<>(6);

        bt.display();
        maxSumPath(root);
    }
}
