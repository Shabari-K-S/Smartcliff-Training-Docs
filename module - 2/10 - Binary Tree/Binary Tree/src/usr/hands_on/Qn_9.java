package usr.hands_on;

import usr.collections.BTNode;
import usr.collections.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Qn_9 {
    static boolean isCompleteBT(BTNode<Integer> root) {
        if(root == null)
            return true;
        Queue<BTNode<Integer>> queue =new LinkedList<>();
        boolean flag = false;
        queue.add(root);
        while(!queue.isEmpty()) {
            BTNode<Integer> temp_node = queue.remove();
            if(temp_node.left != null) {
                if(flag)
                    return false;
                queue.add(temp_node.left);
            } else
                flag = true;
            if(temp_node.right != null) {
                if(flag)
                    return false;
                queue.add(temp_node.right);
            } else
                flag = true;
        }
        return true;
    }


    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.insert(1);
        BTNode<Integer> root = bt.getRoot();
        root.left = new BTNode<>(2);
        root.right = new BTNode<>(3);
        root.left.left = new BTNode<>(4);
        root.left.right = new BTNode<>(5);
        root.right.right = new BTNode<>(6);


        bt.display();
        System.out.println(isCompleteBT(root));
    }
}
