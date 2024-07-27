package com.hands_on.Question10;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("The Area of Rectangle : "+ rectangle.calculateArea());

        Circle circle = new Circle(4);
        System.out.println("The Area of Circle: "+ circle.calculateArea());
    }
}
