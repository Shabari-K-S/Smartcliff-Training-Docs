package com.self_practice;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        int count=0;
        for(char c : str.toCharArray()){
            if(ch == c){
                count++;
            }
        }
        System.out.println("The Occurence of the "+ch+" is "+ count);
    }
}
