package com.self_practice;

import java.util.Scanner;

public class MinimumMovesToCaptureTheQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positions of the white rook, white bishop, and black queen: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println("Minimum number of moves = " + minMoves(a, b, c, d, e, f));
    }

    public static int minMoves(int a, int b, int c, int d, int e, int f) {
        if ((a == e && b == f) || (Math.abs(a - e) == Math.abs(b - f)) || (a == e || b == f)) {
            return 1;
        }
        return 2;
    }
}