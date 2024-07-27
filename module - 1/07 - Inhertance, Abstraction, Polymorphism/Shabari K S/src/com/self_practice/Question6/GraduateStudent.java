package com.self_practice.Question6;

class GraduateStudent extends Person{
    String researchArea;

    GraduateStudent(String name, int age, String researchArea){
        super(name, age);
        this.researchArea = researchArea;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
    }
}
