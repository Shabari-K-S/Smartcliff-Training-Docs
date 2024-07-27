package com.hands_on;

import java.util.Scanner;

public class ZigzagConversion {
    public static String zigzagConversion(String str, int numRows) {
        if (numRows == 1) return str;
        StringBuilder[] res = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            res[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = false;
        for(char c: str.toCharArray()){
            res[row].append(c);
            if (row == 0 || row == numRows-1){
                down = !down;
            }
            row += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numRows; i++){
            result.append(res[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the Number of Rows: ");
        int numRows = sc.nextInt();
        System.out.println(zigzagConversion(str,numRows));
    }
}