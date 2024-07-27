package usr.hands_on;

import usr.collections.BST;

import java.util.Scanner;

public class Qn_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<Integer> tree = new BST<>();
        System.out.print("Enter the value of the tree: ");
        String str = sc.nextLine().trim();
        String[] arr = str.split(" ");
        for (String s : arr) {
            tree.insert(Integer.parseInt(s));
        }
        tree.display();

        System.out.print("Enter the value need to be inserted: ");
        int val = sc.nextInt();
        tree.insert(val);
        System.out.println();
        tree.display();
    }
}
