package com.self_practice.Question6;

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
