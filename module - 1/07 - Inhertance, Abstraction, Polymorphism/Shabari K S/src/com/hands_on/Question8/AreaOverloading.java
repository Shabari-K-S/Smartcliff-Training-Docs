package com.hands_on.Question8;

class AreaOverloading {
    void calculateArea(double breadth, double height){
        System.out.println(breadth * height);
    }

    void calculateArea(double radius){
        System.out.println(Math.PI * radius * radius);
    }

    void  calculateArea(int base, int height){
        System.out.println(0.5 * base * height);
    }
}
