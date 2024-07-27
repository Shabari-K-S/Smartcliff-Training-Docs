package com.self_practice.Question4;

class Circle extends Shape {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
