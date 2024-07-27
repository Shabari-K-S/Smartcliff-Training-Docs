package com.hands_on;

import java.util.Scanner;

public class BinaryStrings {
    public static int binaryString(String str) {
        int cnt = 0;
        for(char c: str.toCharArray()){
            if (c == '1'){
                cnt++;
            }
        }
        return cnt*(cnt-1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary String: ");
        String str = sc.nextLine();
        System.out.println(binaryString(str));
    }
}