package com.hands_on.Question2;


public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.employeeID = 101;
        fullTimeEmployee.name = "John Doe";
        fullTimeEmployee.salary = 5000;
        fullTimeEmployee.displayInfo();
        fullTimeEmployee.calculateSalary();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.employeeID = 102;
        partTimeEmployee.name = "Jane Smith";
        partTimeEmployee.hourlyRate = 20;
        partTimeEmployee.hoursWorked = 40;
        partTimeEmployee.displayInfo();
        partTimeEmployee.calculateSalary();

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.employeeID = 103;
        contractEmployee.name = "Alice Johnson";
        contractEmployee.contractDuration = 6;
        contractEmployee.displayInfo();
        contractEmployee.calculateSalary();
    }
}
