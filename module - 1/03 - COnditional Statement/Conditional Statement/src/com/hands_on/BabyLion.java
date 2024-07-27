
package com.hands_on;

import java.util.Scanner;

public class BabyLion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of animals: ");
        int totalAnimals = sc.nextInt();
        System.out.print("Enter the count of rabbits: ");
        int rabbits = sc.nextInt();
        System.out.print("Enter the count of deer: ");
        int deer = sc.nextInt();
        System.out.print("Enter the count of birds: ");
        int birds = sc.nextInt();
        System.out.print("Enter the count of squirrels: ");
        int squirrels = sc.nextInt();
        if(totalAnimals < rabbits + deer + birds + squirrels){
            System.out.println("Counted wrongly");
        }else if(totalAnimals > rabbits + deer + birds + squirrels ){
            System.out.println("Baby lion is mischievous");
        }else {
            System.out.println("Baby lion is well behaved");
        }
    }
}