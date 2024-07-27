package com.hands_on;

import java.lang.Math;

class Triangle{
    private double side1 = 3;
    private double side2 = 4;
    private double side3 = 5;

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

public class QuestionNo3 {
    public static void main(String[] args) {
        Triangle a = new Triangle();
        System.out.println("Perimeter of the triangle is: " + a.getPerimeter());
        System.out.println("Area of the triangle is: " + a.getArea());
    }
}