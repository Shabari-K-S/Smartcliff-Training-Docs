package com.hands_on;

import java.util.Scanner;

public class CountOfMatchesInTournament {
    public static int countOfMatechesInTournament(int matches){
        if(matches == 1){
            return 0;
        }else{
            if(matches%2==0) {
                return countOfMatechesInTournament(matches / 2) + (matches/2);
            } else {
                return countOfMatechesInTournament((matches)/2)+((matches+1)/2);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        System.out.println("Total number of match played in tournament: "+countOfMatechesInTournament(userInput));
    }
}
