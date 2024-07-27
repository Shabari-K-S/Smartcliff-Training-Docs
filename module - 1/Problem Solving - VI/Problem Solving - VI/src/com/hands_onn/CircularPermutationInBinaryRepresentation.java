package com.hands_onn;

import java.util.*;

public class CircularPermutationInBinaryRepresentation {
    public static List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            res.add(start ^ i ^ i >> 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of start: ");
        int start = sc.nextInt();
        System.out.println(circularPermutation(n, start));
    }
}