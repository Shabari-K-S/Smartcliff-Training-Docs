package usr.hands_on;

import usr.collections.BinaryTree;

import java.util.Scanner;

public class Qn_8 {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values of the Binary Tree: ");
        String[] str = sc.nextLine().split(" ");
        for (String s : str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();
        System.out.println("Min: " + bt.min());
        System.out.println("Max: " + bt.max());
    }
}
