package com.self_practice;

import java.util.Scanner;

public class AreaOfTriangle {
    public double calculateArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        AreaOfTriangle aot = new AreaOfTriangle();
        double area = aot.calculateArea(a, b, c);
        System.out.println(area);

        sc.close();
    }
}