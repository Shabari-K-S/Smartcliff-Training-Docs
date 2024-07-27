package com.hands_on;

import java.util.Scanner;

public class ChocolateAndSweetness {
    public static void chocolateAndSweetness(int size, int query, int[] sweetness, int[] expiry){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<query; i++){
            System.out.println("Enter the value of x: ");
            int x = sc.nextInt();
            System.out.println("Enter the value of y: ");
            int y = sc.nextInt();
            int ans = verify(size, x, y, sweetness, expiry);
            System.out.println("For the query x="+x+" y="+y+" is the available chocolate is "+ans);
        }
    }

    public static int verify(int size, int x, int y, int[] sweetness, int[] expiry){
        int cnt=0;
        for( int i=0; i<size; i++){
            if ((sweetness[i] > x) && (expiry[i] > y)){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int t = sc.nextInt();
        while(t> 0){
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            System.out.println("Enter the number of query: ");
            int query = sc.nextInt();
            int[] sweetness = new int[size];
            int[] expiry = new int[size];
            System.out.println("Enter the sweetness of the chocolate: ");
            for(int i = 0; i < size; i++){
                sweetness[i] = sc.nextInt();
            }
            System.out.println("Enter the expiry of the chocolate: ");
            for(int i = 0; i < size; i++){
                expiry[i] = sc.nextInt();
            }
            chocolateAndSweetness(size, query, sweetness, expiry);
            t--;
        }
    }
}
