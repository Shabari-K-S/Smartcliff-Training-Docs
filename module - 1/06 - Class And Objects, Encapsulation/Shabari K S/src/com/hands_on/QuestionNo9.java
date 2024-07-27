package com.hands_on;

import java.util.Scanner;

class Flight{
    private int flightNumber;
    private String destination;
    private float distance;
    private float fuel;

    private void CALFUEL(){
        if(distance <= 1000){
            fuel = 500;
        }else if(distance > 1000 && distance <= 2000){
            fuel = 1100;
        }else{
            fuel = 2200;
        }
    }

    public void FEEDINFO(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Flight Number: ");
        flightNumber = sc.nextInt();
        System.out.print("Enter the Destination: ");
        destination = sc.next();
        System.out.print("Enter the Distance: ");
        distance = sc.nextFloat();
        CALFUEL();
    }

    public void SHOWINFO(){
        System.out.println("---------------------  Flight Details  ---------------------");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance);
        System.out.println("Fuel: " + fuel);
        System.out.println("------------------------------------------------------------");
    }
}

public class QuestionNo9 {
    public static void main(String[] args) {
        Flight f = new Flight();
        f.FEEDINFO();
        f.SHOWINFO();
    }
}