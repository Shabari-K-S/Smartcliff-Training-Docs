package com.self_practice;

import java.util.Scanner;

public class NumberOfStepsToReduceNumberInBinaryRepresentationToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary representation of an integer: ");
        String s = sc.next();
        System.out.println("Number of steps = " + numSteps(s));
    }

    public static int numSteps(String s) {
        int steps = 0;
        while (s.length() > 1) {
            if (s.charAt(s.length() - 1) == '0') {
                s = s.substring(0, s.length() - 1);
            } else {
                s = addOne(s);
            }
            steps++;
        }
        return steps;
    }

    public static String addOne(String s) {
        StringBuilder sb = new StringBuilder();
        int carry = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (carry == 0) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == '0') {
                sb.append('1');
                carry = 0;
            } else {
                sb.append('0');
            }
        }
        if (carry == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}