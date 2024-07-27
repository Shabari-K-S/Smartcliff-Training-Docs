package com.hands_on.Question2;

public class ContractEmployee extends Employee {
    int contractDuration;

    void calculateSalary() {
        System.out.println("Salary: " + contractDuration * 1000);
    }
}
