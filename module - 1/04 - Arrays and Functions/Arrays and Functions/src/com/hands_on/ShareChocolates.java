package com.hands_on;

import java.util.Scanner;

public class ShareChocolates {
    public String canShare(int n, int[] arr){
        int totalChocolates = 0;
        for(int i=0; i<n; i++){
            totalChocolates += arr[i];
        }
        if(totalChocolates % n == 0){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of chocolates each friend has: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ShareChocolates sch = new ShareChocolates();
        String result = sch.canShare(n, arr);
        System.out.println(result);

        sc.close();
    }
}