package com.self_practice;

class Employee{
    double salary;
    int hours;

    public void getInfo(double salary, int hours){
        this.salary = salary;
        this.hours = hours;
    }

    public void AddSal(){
        if(salary<500){
            salary += 10;
        }
    }

    public void AddWork(){
        if(hours>6){
            salary += 5;
        }
    }

    public void display(){
        System.out.println("Final Salary: "+salary);
    }
}

public class Question5{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.getInfo(400, 8);
        emp.AddSal();
        emp.AddWork();
        emp.display();
    }
}