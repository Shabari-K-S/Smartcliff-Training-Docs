package com.hands_on;

import java.util.Scanner;

class Temperature{
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}

public class QuestionNo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + Temperature.celsiusToFahrenheit(celsius));
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + Temperature.fahrenheitToCelsius(fahrenheit));
    }
}