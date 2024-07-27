package com.hands_on;

import java.util.ArrayList;
import java.util.Scanner;

public class InterestingAlphabetsArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for(int i=1; i<n+1; i++){
            ArrayList<Character> temp = new ArrayList<>();
            for(int j=n-i; j<n; j++){
                temp.add((char)(j+65));
            }
            list.add(temp);
        }

        for(ArrayList<Character> i: list){
            for(char j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}