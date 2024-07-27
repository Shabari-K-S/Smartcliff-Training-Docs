package com.hands_on;

import java.util.Scanner;

public class ValidateIPAddress {
    public static String validateIPAddress(String str) {
        if (str.contains(".")){
            if (validateIPv4(str)){
                return "IPv4";
            }
        }else if (str.contains(":")){
            if (validateIPv6(str)){
                return "IPv6";
            }
        }
        return "Neither";
    }
    public static boolean validateIPv4(String str){
        String[] parts = str.split("\\.");
        if (parts.length != 4){
            return false;
        }
        for(String part: parts){
            if (part.isEmpty() || part.length() > 3){
                return false;
            }
            if (part.charAt(0) == '0' && part.length() > 1){
                return false;
            }
            for(char c: part.toCharArray()){
                if (!Character.isDigit(c)){
                    return false;
                }
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }
    public static boolean validateIPv6(String str){
        String[] parts = str.split(":");
        if (parts.length != 8){
            return false;
        }
        for(String part: parts){
            if (part.isEmpty() || part.length() > 4){
                return false;
            }
            for(char c: part.toCharArray()){
                if (!Character.isDigit(c) && (c < 'a' || c > 'f') && (c < 'A' || c > 'F')){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address: ");
        String str = sc.nextLine();
        System.out.println(validateIPAddress(str));
    }
}