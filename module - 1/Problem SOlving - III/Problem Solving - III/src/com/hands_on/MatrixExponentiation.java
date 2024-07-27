package com.hands_on;

import java.util.*;

public class MatrixExponentiation {
    public static double [][] matrixProduct(double [][] a, double [][] b)
    {
        double [][] temp = new double[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 7; k++) {
                    temp[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return temp;
    }

    public static double [][] matExpo(double [][] mul, int n) {
        double [][] s = {{ 1, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 1 }};
        while (n != 1) {
            if (n % 2 == 1) {
                s = matrixProduct(s, mul);
            }
            mul = matrixProduct(mul, mul);
            n /= 2;
        }
        return matrixProduct(mul, s);
    }

    public static double matrixExponentiation(int n) {
        n = n - 1;
        if(n <= 6) {
            return 6.00;
        }
        double [][]mul = {{(double)7 / 6, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 1 },
                {(double) - 1 / 6, 0, 0, 0, 0, 0, 0 }};
        mul = matExpo(mul, n - 6);
        double ans = (mul[0][0] + mul[1][0] + mul[2][0] + mul[3][0] + mul[4][0] + mul[5][0]) * 6;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n <= 6) {
                System.out.println("1");
            } else {
                double expectedMoves = matrixExponentiation(n);
                System.out.println((int)expectedMoves%6);
            }
        }
        scanner.close();
    }
}
