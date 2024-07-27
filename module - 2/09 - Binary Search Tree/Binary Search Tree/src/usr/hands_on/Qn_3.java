package usr.hands_on;

import usr.collections.BST;

import java.util.Scanner;

public class Qn_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<Integer> tree = new BST<>();
        System.out.println("Enter the val of the tree: ");
        String str = sc.nextLine().trim();
        String[] arr = str.split(" ");
        for (String s : arr) {
            tree.insert(Integer.parseInt(s));
        }
        tree.display();
        System.out.println("Enter the value need to be removed: ");
        int val = sc.nextInt();
        tree.delete(val);
        tree.display();
    }
}
