package com.hands_on;

class Circle{
    private double radius = 1.0;
    private String color = "red";

    Circle(){
        System.out.println("Calling default Constructor");
    }

    Circle(double radius){
        this.radius = radius;
        System.out.println("Calling single parameterized Constructor");
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        System.out.println("Calling multi parameterized Constructor");
    }

    public void setRadius(double val){
        radius = val;
    }

    public void  setColor(String val){
        color = val;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void display(){
        System.out.println("The object data is ");
        System.out.println("Radius = "+this.radius);
        System.out.println("Color = "+this.color);
    }
}

public class QuestionNo1 {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle(2.15);
        Circle c = new Circle(3.14, "Black");
        a.display();
        b.display();
        c.display();
    }
}
