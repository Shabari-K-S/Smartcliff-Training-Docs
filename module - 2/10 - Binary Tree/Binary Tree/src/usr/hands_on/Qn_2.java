package usr.hands_on;

import usr.collections.BinaryTree;

import java.util.Scanner;

public class Qn_2 {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of the Binary Tree: ");
        String[] str = sc.nextLine().split(" ");
        for (String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();
        System.out.print("Enter the element need to be deleted: ");
        int ele = sc.nextInt();
        bt.delete(ele);
        bt.display();
    }
}
