package com.hands_on;

import java.util.Scanner;

public class DefangingAnIPAddress {
    public static String defangingAnIPAddress(String str) {
        StringBuilder res = new StringBuilder();
        for(char c: str.toCharArray()){
            if (c == '.'){
                res.append("[.]");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address: ");
        String str = sc.nextLine();
        System.out.println(defangingAnIPAddress(str));
    }
}