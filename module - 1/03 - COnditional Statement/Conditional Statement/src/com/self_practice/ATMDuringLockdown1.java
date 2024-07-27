package com.self_practice;

import java.util.Scanner;

public class ATMDuringLockdown1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] notes = {2000, 500, 100};
        int count = 0, i = 0;
        while (i < 3){
            if (amount >= notes[i]){
                count = amount % notes[i];
                System.out.println(count + " notes on "+ notes[i]);
                amount = amount % notes[i];
            }
            i++;
        }
    }
}