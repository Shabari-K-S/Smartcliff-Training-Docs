package com.hands_onn;

import java.util.*;

public class DiamondOfNumbersWithArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n; i+=2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j <= 2*n-i; j++) {
                stringBuilder.append(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                if (k >= 10)
                    k=1;
                stringBuilder.append(k+ " ");
                k++;
            }
            str.add(stringBuilder.toString());
        }
        for (int i = 2*n-2; i >= 0; i-=2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 1; j <= 2*n-i+1; j++) {
                stringBuilder.append(" ");
            }
            int k = 1;
            for (int j = 1; j < i; j++) {
                if (k >= 10)
                    k=1;
                stringBuilder.append(k+ " ");
                k++;
            }
            str.add(stringBuilder.toString());
        }

        for (String c: str){
            System.out.println(c);
        }
    }
}
