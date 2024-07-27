package com.hands_on;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth of the Rectangle: ");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("Square");
        }else{
            System.out.println("Not a square");
        }
    }
}
