package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

public class Qn_8 {
    public static int goodNodes(BTNode<Integer> root) {
        int maxValue = -10001;
        return dfs(root,maxValue);
    }

    public static int dfs(BTNode<Integer> curr, int maxVal) {
        if(curr==null) {
            return 0;
        }
        if (curr.data>=maxVal) {
            int left = dfs(curr.left,curr.data);
            int right = dfs(curr.right,curr.data);
            return 1+left+right;
        } else {
            int left = dfs(curr.left,maxVal);
            int right = dfs(curr.right,maxVal);
            return left+right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree<Integer> bt = new BinaryTree<>();
        System.out.println("Enter the values of binary tree: ");
        String[] str = sc.nextLine().split(" ");
        for (String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        System.out.println(goodNodes(bt.getRoot()));
    }
}
