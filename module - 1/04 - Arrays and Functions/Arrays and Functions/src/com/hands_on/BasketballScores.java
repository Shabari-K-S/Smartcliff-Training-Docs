package com.hands_on;

import java.util.Scanner;

public class BasketballScores {
    public void findAverage(int n, int[][] arr){
        for(int i=0; i<n; i++){
            int sum = 0;
            int count = 0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
                count++;
            }
            double avg = (double)sum/count;
            System.out.println("Average score of Team "+(i+1)+": "+avg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teams: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][];
        for(int i=0; i<n; i++){
            System.out.print("Enter the number of players in Team "+(i+1)+": ");
            int players = sc.nextInt();
            arr[i] = new int[players];
            System.out.println("Enter the scores of players in Team "+(i+1)+": ");
            for(int j=0; j<players; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        BasketballScores bs = new BasketballScores();
        bs.findAverage(n, arr);

        sc.close();
    }
}