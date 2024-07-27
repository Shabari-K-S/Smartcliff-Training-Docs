package com.hands_on.Question2;

public abstract class Employee {
    int employeeID;
    String name;

    void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
    }

    abstract void calculateSalary();
}
