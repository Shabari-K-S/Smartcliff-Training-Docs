package usr.hands_on;

import usr.collections.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<Integer> bst = new BST<Integer>();
        System.out.println("Enter the values of the tree: ");
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        for (String str1 : strs) {
            bst.insert(Integer.parseInt(str1));
        }
        List<Integer> inorder = new ArrayList<Integer>();
        bst.inorderTraversal(bst.getRoot(),inorder);
        int len = inorder.size();
        int median;
        if (len%2 == 0) {
            median = (inorder.get(len/2)+inorder.get((len/2)-1))/2;
        } else {
            median = inorder.get(len/2);
        }
        System.out.println("Median: " + median);
    }
}
