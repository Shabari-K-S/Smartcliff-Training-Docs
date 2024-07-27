package usr.Assessments;

/*
    Question: All Elements in Two Binary Search Trees
        Problem Statement : Given two binary search trees root1 and
            root2, return a list containing all the integers from both trees
            sorted in ascending order.
        Example 1:
            Input: root1 = [2,1,4], root2 = [1,0,3]
            Output: [0,1,1,2,3,4]
        Example 2:
            Input: root1 = [1,null,8], root2 = [8,1]
            Output: [1,1,8,8]

    @author: Shabari K S
 */

import usr.collection.BST;

import java.util.*;


public class Qn_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of BST one: ");
        String[] bst = sc.nextLine().split(" ");
        System.out.println("Enter the values of BST two: ");
        String[] bst2 = sc.nextLine().split(" ");
        BST<Integer> res = new BST<>();
        for(String s : bst) {
            res.insert(Integer.parseInt(s));
        }
        for(String s : bst2) {
            res.insert(Integer.parseInt(s));
        }
        res.getInOrder();
    }
}
