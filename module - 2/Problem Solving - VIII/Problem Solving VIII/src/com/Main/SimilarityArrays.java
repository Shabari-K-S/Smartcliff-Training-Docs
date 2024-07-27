package com.Main;

import java.util.Scanner;
import java.util.*;

public class SimilarityArrays {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sizes: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n+m; i++) {
            list.add(sc.nextInt());
        }
        System.out.println((m+n)-list.size()+" "+list.size());


    }

}
