/*
 *  Question:
 *      Swap the node not the data
 *
 *  Example:
 *      Input:
 *          head -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
 *          20 40
 *
 *      Output:
 *          head -> 10 -> 40 -> 30 -> 20 -> 50 -> 60 -> null
 *
 */

package problems;

import java.util.Scanner;

public class Qn_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the Linked List: ");
        String[] str = sc.nextLine().trim().split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        for(String s : str) {
            list.push(Integer.parseInt(s));
        }
        list.display();
        System.out.println("Enter the values of k: ");
        int k = sc.nextInt();
        list.swapNode(k);
        System.out.println("Linked List After Swapping: ");
        list.display();
    }
}
