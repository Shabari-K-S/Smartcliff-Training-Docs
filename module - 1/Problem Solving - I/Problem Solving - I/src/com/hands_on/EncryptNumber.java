package com.hands_on;

import java.util.Scanner;

public class EncryptNumber {
    public static int encryptNumber(int n) {
        int result = n;
        for (int i = n - 1; i >= 1; i--) {

            result = result * i;

            if (i == 1) {
                break;
            }
            i--;
            result = result / i;
            if (i == 1) {
                break;
            }
            i--;
            result = result + i;
            if (i == 1) {
                break;
            }
            i--;
            result = result - i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println(encryptNumber(userInput));
    }
}