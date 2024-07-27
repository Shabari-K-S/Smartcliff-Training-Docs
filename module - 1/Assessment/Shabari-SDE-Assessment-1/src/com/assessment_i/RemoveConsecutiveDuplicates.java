package com.assessment_i;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    private static void removeConsecutiveDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if (str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("The string after removing consecutive duplicates: "+sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        removeConsecutiveDuplicates(str);
    }
}