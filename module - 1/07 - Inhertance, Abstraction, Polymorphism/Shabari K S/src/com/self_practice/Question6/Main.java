package com.self_practice.Question6;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Alice", 20);
        p1.displayInfo();

        UndergraduateStudent u = new UndergraduateStudent("Bob", 22, "Computer Science");
        u.displayInfo();

        GraduateStudent g = new GraduateStudent("Charlie", 25, "Machine Learning");
        g.displayInfo();
    }
}
