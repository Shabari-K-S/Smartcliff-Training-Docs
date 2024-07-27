package com.hands_on.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);
        int n, p;
        n = scanner.nextInt();
        p = scanner.nextInt();
        try {
            System.out.println(myCalculator.power(n, p));
        } catch (InvalidInputException e) {
            System.out.println(e);
        }
    }
}
