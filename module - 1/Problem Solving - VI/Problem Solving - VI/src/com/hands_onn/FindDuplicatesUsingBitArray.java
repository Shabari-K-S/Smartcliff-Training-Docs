package com.hands_onn;

import java.util.*;

public class FindDuplicatesUsingBitArray {

    public static ArrayList<Integer> findDup(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (ans.contains(arr.get(i))) {
                ans.remove(arr.get(i));
            } else {
                ans.add(arr.get(i));
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            arr.remove(ans.get(i));
        }
        Set<Integer> set = new HashSet<>(arr);
        ArrayList<Integer> op = new ArrayList<>(set);
        Collections.sort(op);
        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i< n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(findDup(arr));

    }
}
