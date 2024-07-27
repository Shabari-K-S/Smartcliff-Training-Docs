package com.hands_on.Question10;

class Circle extends Shape{
       double radius;

       public Circle(double radius){
           this.radius = radius;
       }

       @Override
       public double calculateArea(){
           return Math.PI * radius * radius;
       }
}
