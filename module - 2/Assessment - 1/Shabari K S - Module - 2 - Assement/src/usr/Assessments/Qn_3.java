/*
 *  Question : Reverse Alternate k Nodes
 *      Problem statement: You are given a Singly Linked List of
 *          integers and a positive integer 'K'. Modify the linked list by
 *          reversing every alternate 'K' nodes of the linked list.
 *          A singly linked list is a type of linked list that is unidirectional,
 *          that is, it can be traversed in only one direction from head to
 *          the last node (tail).
 *      Note:
 *          If the number of nodes in the list or in the last group is less than
 *          'K', just reverse the remaining nodes.
 *      Example:
 *          Linked list: 5 6 7 8 9 10 11 12
 *          K: 3
 *          Output: 7 6 5 8 9 10 12 11
 *      We reverse the first 'K' (3) nodes and then skip the next 'K'(3)
 *      nodes. Now, since the number of nodes remaining in the list (2)
 *      is less than 'K', we just reverse the remaining nodes (11 and
 *      12).
 *      Input 1:
 *          1 2 3 4 5 6 7 -1
 *          2
 *      Output 1:
 *          2 1 3 4 6 5 7 -1
 *      Explanation of input 1:
 *          In the given linked list, we have to reverse the first two nodes,
 *          then skip two nodes, and so on… until all the nodes are
 *          processed in the same way.
 *          The modified linked list after the above process is 2 1 3 4 6 5 7
 *          -1
 *
 *      @author: Shabari K S
 */

package usr.Assessments;

import java.util.Scanner;

public class Qn_3 {
    public static void reverseAlternateKNodes(int[] arr, int k) {
        if (arr == null || arr.length < k) return;
        int temp = arr[0];
        for (int i = 0; i < k; i++ ) {
            arr[i] = arr[i+1];
        }
        arr[k] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the array: ");
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        reverseAlternateKNodes(arr,k-1);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
