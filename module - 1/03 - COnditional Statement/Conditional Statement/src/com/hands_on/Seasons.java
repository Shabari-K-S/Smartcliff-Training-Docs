package com.hands_on;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        String season = "";
        if(month < 1 || month > 12){
            season = "Invalid month";
        }else if(month >= 3 && month <= 5){
            season = "Spring";
        }else if(month >= 6 && month <= 8){
            season = "Summer";
        }else if(month >= 9 && month <= 11){
            season = "Autumn";
        }else{
            season = "Winter";
        }
        System.out.println(season);
    }
}