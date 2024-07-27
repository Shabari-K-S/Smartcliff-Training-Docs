package com.self_practice;

import java.util.Scanner;

public class FirstTwoCharsWithAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        if(str.length()<2){
            System.out.print(str);
            for(int i=str.length();i<2;i++){
                System.out.print("@");
            }
        }
        else{
            System.out.print(str.substring(0,2));
        }
    }
}
