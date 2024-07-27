package com.self_practice;

class Employee1 {
    private int id;
    private String name;
    private int age;
    private double salary;

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id>0){
            this.id = id;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary>=0){
            this.salary = salary;
        }
    }

    public void raiseSalary(double percentage){
        salary += salary * percentage / 100;
    }

    public void displayInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}

public class Question9{
    public static void main(String[] args){
        Employee1 emp = new Employee1();
        emp.setId(1);
        emp.setName("Shabari");
        emp.setAge(20);
        emp.setSalary(100000);
        emp.raiseSalary(10);
        emp.displayInfo();
    }
}