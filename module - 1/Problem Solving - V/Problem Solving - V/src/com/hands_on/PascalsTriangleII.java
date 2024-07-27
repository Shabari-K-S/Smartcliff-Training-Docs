package com.hands_on;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1; i<=rowIndex; i++){
            row.add((int)((long)row.get(i-1)*(rowIndex-i+1)/i));
        }
        return row;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int rowIndex = sc.nextInt();
        System.out.println(getRow(rowIndex));
    }
}