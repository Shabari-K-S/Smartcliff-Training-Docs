package com.self_practice.Question2;

class Employee {
    int ID;
    String name;
    double salary;

    double calculateYearlySalary(){
        return salary * 12;
    }

    double calculateYearlySalary(int dailySalary, int days){
        return dailySalary * days;
    }

    double calculateYearlySalary(double hourlySalary, int hours){
        return hourlySalary * hours * 365;
    }

    public String toString(){
        return "ID: " + ID + ", Name: " + name + ", Salary: " + salary;
    }
}
