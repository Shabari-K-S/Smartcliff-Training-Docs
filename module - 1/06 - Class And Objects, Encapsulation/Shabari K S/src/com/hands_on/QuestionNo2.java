package com.hands_on;

import java.util.Scanner;

class Area{
    private double length;
    private double breadth;

    public void setDim(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length * breadth;
    }
}

public class QuestionNo2 {
    public static void main(String[] args) {
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        a.setDim(length, breadth);
        System.out.println("Area of the rectangle is: " + a.getArea());
    }
}