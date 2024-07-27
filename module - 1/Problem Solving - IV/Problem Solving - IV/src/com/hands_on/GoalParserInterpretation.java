package com.hands_on;

import java.util.Scanner;

public class GoalParserInterpretation {
    public static String goalParserInterpretation(String str) {
        return str.replace("()","o").replace("(al)","al");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the command: ");
        String str = sc.nextLine();
        System.out.println(goalParserInterpretation(str));
    }
}