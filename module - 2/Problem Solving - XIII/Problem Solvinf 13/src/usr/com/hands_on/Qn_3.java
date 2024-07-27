package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

class Info {
    int diameter;
    int height;

    public Info(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}

public class Qn_3 {
    public static Info calc(BTNode<Integer> root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftData = calc(root.left);
        Info rightData = calc(root.right);

        int currDiameter = Math.max(Math.max(leftData.diameter, rightData.diameter),
                leftData.height + rightData.height);
        int currHeight = Math.max(leftData.height, rightData.height) + 1;

        return new Info(currDiameter, currHeight);

    }

    public static int diameterOfBinaryTree(BTNode<Integer> root) {
        Info ans = calc(root);
        return ans.diameter;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the Binary Tree: ");
        String[] str = sc.nextLine().split(" ");
        for(String s: str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();
        System.out.println(diameterOfBinaryTree(bt.getRoot()));
    }
}
