package com.self_practice;

import java.util.Scanner;

public class GroupSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ticket number: ");
        int ticketNumber = sc.nextInt();

        if (ticketNumber % 10 == 0){
            System.out.println("Group Leader");
        } else {
            System.out.println("Group Member");
        }
    }
}