package com.hands_onn;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valToIndex = new ArrayList<>();
        ArrayList<String> vals = new ArrayList<>();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String key = sc.next();
            vals.add(key);
        }

        for (int i = 0; i < size; i++){
            int val = sc.nextInt();
            valToIndex.add(val);
        }

        ArrayList<String> ans = new ArrayList<>();

    }
}
