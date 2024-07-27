package com.hands_on;

import java.util.Scanner;

public class EggDrop {
    public static int eggDrop(int n) {
        int moves = 0;
        while (n > 0) {
            moves++;
            n -= moves;
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of floors: ");
        int n = sc.nextInt();
        System.out.println("Minimum number of moves required to determine the value of f is "+ eggDrop(n));
    }
}