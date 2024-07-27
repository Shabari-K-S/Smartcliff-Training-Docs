package com.hands_on.Question6;

class Rectangle implements IShape{
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (width + height);
    }
}
