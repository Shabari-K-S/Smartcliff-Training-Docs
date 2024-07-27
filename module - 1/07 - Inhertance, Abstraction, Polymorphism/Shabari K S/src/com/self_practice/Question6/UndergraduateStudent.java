package com.self_practice.Question6;

class UndergraduateStudent extends Person{
    String major;

    UndergraduateStudent(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}
