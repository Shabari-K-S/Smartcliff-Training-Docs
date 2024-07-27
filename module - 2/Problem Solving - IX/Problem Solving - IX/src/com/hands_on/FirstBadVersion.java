package com.hands_on;

import java.util.Scanner;

public class FirstBadVersion {
    public static void main(String[] args) {
        int total = 5, bad = 2, min = Integer.MAX_VALUE;
        for(int i = 0; i < total; i++){
            if ( i > bad && i < min) {
                min = i;
                break;
            }
        }
        System.out.println(min+1);

    }
}
