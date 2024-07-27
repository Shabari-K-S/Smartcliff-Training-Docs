package usr.com.hands_on;

import usr.pkg.collection.BTNode;
import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

public class Qn_6 {
    public static BTNode<Integer> mergeTrees(BTNode<Integer> root1, BTNode<Integer> root2) {
        if(root1==null)  return root2;
        else if(root2==null)  return root1;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        root1.data += root2.data;
        return root1;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt1 = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of tree: ");
        String[] str = sc.nextLine().split(" ");
        for(String s : str){
            bt1.insert(Integer.parseInt(s));
        }
        BinaryTree<Integer> bt2 = new BinaryTree<>();
        System.out.println("Enter the values of tree: ");
        str = sc.nextLine().split(" ");
        for(String s : str){
            bt2.insert(Integer.parseInt(s));
        }

        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.set_root(mergeTrees(bt1.getRoot(), bt2.getRoot()));
        bt.display();
    }

}
