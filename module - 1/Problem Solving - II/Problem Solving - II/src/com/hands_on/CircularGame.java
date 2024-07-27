package com.hands_on;

import java.util.Scanner;

public class CircularGame {
    public static int findTheWinner(int n, int k) {
        int[] friends = new int[n];
        for (int i = 0; i < n; i++) {
            friends[i] = i + 1;
        }
        findTheWinnerRecursive(k,friends,0);
        int start = 0;
        while (friends.length > 1) {
            int removeIndex = (start + k - 1) % friends.length;
            int[] newFriends = new int[friends.length - 1];
            int l = 0;
            for (int i = 0; i < friends.length; i++) {
                if (i != removeIndex) {
                    newFriends[l++] = friends[i];
                }
            }
            friends = newFriends;
            start = removeIndex % friends.length;
        }
        return friends[0];
    }

    public static void findTheWinnerRecursive(int k, int[] friends,int flag){
        if (friends.length < 1){
            System.out.println(friends[0]);
        }else{
            int removeIndex = (flag + k - 1) % friends.length;
            int[] newFriends = new int[friends.length - 1];
            int l = 0;
            for (int i = 0; i < friends.length; i++) {
                if (i != removeIndex) {
                    newFriends[l++] = friends[i];
                }
            }
            if (newFriends.length < 1){
                System.out.println(friends[0]);
                return;
            }
            findTheWinnerRecursive(k,newFriends, removeIndex % (friends.length-1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("The Winner Of the Game is "+ findTheWinner(n, k));
    }
}