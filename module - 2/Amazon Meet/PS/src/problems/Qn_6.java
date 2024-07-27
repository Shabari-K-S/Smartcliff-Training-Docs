/*
 *  Question:
 *      Linked List Merging
 *  Example:
 *      Input:
 *          1 -> 2 -> 3 -> 4
 *          5 -> 6 -> 7 -> 8
 *      Output:
 *          1 -> 5 -> 2 -> 6 -> 3 -> 7 -> 4 -> 8
 *
 */

package problems;

import java.util.Scanner;
import java.util.ArrayList;

public class Qn_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Enter the values of First Linked List: ");
        String[] str = sc.nextLine().trim().split(" ");
        for(String s : str) {
            l1.push(Integer.parseInt(s));
        }
        LinkedList<Integer> l2 = new LinkedList<>();
        System.out.println("Enter the values of Second Linked List: ");
        String[] str2 = sc.nextLine().trim().split(" ");
        for(String s : str2) {
            l2.push(Integer.parseInt(s));
        }
        ArrayList<LinkedList<Integer>> l3 = l1.merge(l2); // check the method in LinkedList.java
        l3.get(0).display();
        l3.get(1).display();
    }
}
