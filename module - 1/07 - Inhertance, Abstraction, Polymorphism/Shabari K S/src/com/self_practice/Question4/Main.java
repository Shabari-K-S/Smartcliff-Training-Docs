package com.self_practice.Question4;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());

        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + t.calculateArea());
        System.out.println("Triangle Perimeter: " + t.calculatePerimeter());
    }
}
