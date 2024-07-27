import usr.pkg.collection.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the tree: ");
        String[] str = sc.nextLine().split(" ");
        for (String s: str) {
            bt.insert(Integer.parseInt(s));
        }
        bt.display();
    }
}