package com.hands_on;

import java.util.Scanner;

public class LuckyDraw {
    public void findPrize(int[] set1, int[] set2, int customer){
        boolean found = false;
        for(int i=0; i<set1.length; i++){
            if(set1[i] == customer){
                System.out.println("Rs.10000 Cash Prize");
                found = true;
            }
        }
        if(!found){
            for(int i=0; i<set2.length; i++){
                if(set2[i] == customer){
                    System.out.println("Tour Tickets for two days");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Better luck next time");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first set of coupon numbers: ");
        int[] set1 = new int[10];
        for(int i=0; i<10; i++){
            set1[i] = sc.nextInt();
        }

        System.out.println("Enter the second set of coupon numbers: ");
        int[] set2 = new int[10];
        for(int i=0; i<10; i++){
            set2[i] = sc.nextInt();
        }

        System.out.print("Enter the customer coupon number: ");
        int customer = sc.nextInt();

        LuckyDraw ld = new LuckyDraw();
        ld.findPrize(set1, set2, customer);

        sc.close();
    }
}