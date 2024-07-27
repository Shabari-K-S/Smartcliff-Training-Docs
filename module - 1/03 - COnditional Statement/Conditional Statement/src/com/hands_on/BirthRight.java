package com.hands_on;

import java.util.Scanner;

public class BirthRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Choi Sung: ");
        int choiSungAge = sc.nextInt();
        System.out.print("Enter the age of Moui Sung: ");
        int mouiSungAge = sc.nextInt();
        System.out.print("Enter the age of Bhoi Sung: ");
        int bhoiSung = sc.nextInt();
        if  (choiSungAge > mouiSungAge && choiSungAge > bhoiSung){
            System.out.println("Choi Sung");
        } else if (mouiSungAge > choiSungAge && mouiSungAge > bhoiSung){
            System.out.println("Moui Sung");
        } else {
            System.out.println("Bhoi Sung");
        }
    }
}