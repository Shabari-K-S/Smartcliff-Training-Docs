package com.hands_on;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FlattenALinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of head nodes: ");
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<LinkedList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.print("Enter the number of elements in the child linked list: ");
            int m = sc.nextInt();
            LinkedList<Integer> childList = new LinkedList<>();
            for(int j=0; j<m; j++){
                childList.add(sc.nextInt());
            }
            list.add(childList);
        }
        for(LinkedList<Integer> l: list){
            for(int i: l){
                linkedList.add(i);
            }
        }
        linkedList.sort(null);
        System.out.println("The Flattened Linked List: " + linkedList);
    }
}