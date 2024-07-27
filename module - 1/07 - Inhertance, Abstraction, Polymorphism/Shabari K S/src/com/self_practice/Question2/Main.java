package com.self_practice.Question2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Shabari";
        e.ID = 137;
        e.salary = 1_00_000;
        System.out.println("Yearly Salary (Monthly): " + e.calculateYearlySalary());
        System.out.println("Yearly Salary (Daily): " + e.calculateYearlySalary(2000, 25));
        System.out.println("Yearly Salary (Hourly): " + e.calculateYearlySalary(50.65, 8));
        System.out.println(e);
    }
}
