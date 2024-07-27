package com.hands_on.Question2;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    void calculateSalary() {
        System.out.println("Salary: " + hourlyRate * hoursWorked);
    }
}
