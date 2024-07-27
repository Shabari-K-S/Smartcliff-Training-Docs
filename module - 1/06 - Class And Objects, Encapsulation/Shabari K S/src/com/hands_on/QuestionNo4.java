package com.hands_on;

class Employee{
    private double salary;
    private int hoursWorked;

    public void getInfo(double salary, int hoursWorked){
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public void AddSal(){
        if(salary < 500){
            salary += 10;
        }
    }

    public void AddWork(){
        if(hoursWorked > 6){
            salary += 5;
        }
    }

    public double getSalary(){
        return salary;
    }
}

public class QuestionNo4 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.getInfo(450, 7);
        a.AddSal();
        a.AddWork();
        System.out.println("Final Salary: " + a.getSalary());
    }
}