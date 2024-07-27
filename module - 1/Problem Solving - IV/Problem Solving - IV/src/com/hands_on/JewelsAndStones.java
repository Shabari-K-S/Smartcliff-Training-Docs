package com.hands_on;

import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the jewels: ");
        String jewels = sc.next();
        System.out.println("Enter the stones: ");
        String stones = sc.next();
        int sum = 0;
        for(char c1: jewels.toCharArray()){
            for(char c2: stones.toCharArray()){
                if (c1 == c2){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
    }
}
