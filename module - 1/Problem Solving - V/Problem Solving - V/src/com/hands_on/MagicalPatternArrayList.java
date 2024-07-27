package com.hands_on;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalPatternArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=1; i<2*n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=1; j<2*n; j++){
                temp.add(n - Math.max(Math.min(i, 2 * n - i), Math.min(j, 2 * n - j)) + 1);
            }
            list.add(temp);
        }

        for(ArrayList<Integer> i: list){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}