package com.hands_on;

import java.util.Scanner;

public class KittuJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int roomNumber = sc.nextInt();
        for(int i = roomNumber; i <= 100; i += 10){
            System.out.print(i+" ");
        }
    }
}
