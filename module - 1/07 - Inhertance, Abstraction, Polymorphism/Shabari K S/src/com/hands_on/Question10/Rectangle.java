package com.hands_on.Question10;

class Rectangle extends Shape {
    double breadth;
    double length;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
