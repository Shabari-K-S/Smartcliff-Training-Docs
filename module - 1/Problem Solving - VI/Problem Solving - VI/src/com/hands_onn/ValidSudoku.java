package com.hands_onn;

import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        System.out.println("Enter the elements of the board : ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("The board is valid : " + isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (!set.add(num + " in row " + i) || !set.add(num + " in column " + j) || !set.add(num + " in sub-box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}