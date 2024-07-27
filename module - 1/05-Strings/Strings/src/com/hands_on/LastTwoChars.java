package com.hands_on;

import java.util.Scanner;

public class LastTwoChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String lastTwoChars = s.substring(s.length()-2);
        System.out.println("Last Two Chars: " + lastTwoChars+lastTwoChars+lastTwoChars);
    }
}
