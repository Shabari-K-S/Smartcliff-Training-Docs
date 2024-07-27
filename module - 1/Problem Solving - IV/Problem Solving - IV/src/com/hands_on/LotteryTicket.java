package com.hands_on;

import java.util.Scanner;

public class LotteryTicket {
    public static int lotteryTicket(int n, int k, String matchStr, String[] tickets) {
        int res = 0;
        for(String ticket: tickets){
            for(int i=0; i<=matchStr.length()-ticket.length(); i++){
                int count = 0;
                for(int j=0; j<ticket.length(); j++){
                    if (ticket.charAt(j) != matchStr.charAt(i+j)){
                        count++;
                    }
                    if (count > k){
                        break;
                    }
                }
                if (count <= k){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Test Cases: ");
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String matchStr = sc.nextLine();
            String[] tickets = new String[n];
            for(int i=0; i<n; i++){
                tickets[i] = sc.nextLine();
            }
            System.out.println(lotteryTicket(n, k, matchStr, tickets));
        }
    }
}