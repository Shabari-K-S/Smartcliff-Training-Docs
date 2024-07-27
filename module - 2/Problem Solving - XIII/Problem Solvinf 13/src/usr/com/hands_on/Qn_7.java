package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.*;

public class Qn_7 {
    public static  List<List<Integer>> levelOrder(BTNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<BTNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                BTNode<Integer> currentNode = queue.poll();

                currentLevel.add(currentNode.data);
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }

            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the tree: ");
        String[] str = sc.nextLine().split(" ");
        for (String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();
        System.out.println(levelOrder(bt.getRoot()));
    }
}
