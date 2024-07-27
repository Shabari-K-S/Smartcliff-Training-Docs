package com.hands_on;

class Student{
    public int studentId;
    public String studentName;
    public int age;
    public String grade;

    Student(){
        studentId = 0;
        studentName = "Unknown";
        age = 0;
        grade = "Unknown";
    }

    Student(int studentId, String studentName, int age, String grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.grade = grade;
    }
}

public class QuestionNo8 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "John", 15, "10th Grade");
        System.out.println("Student 1 Details:");
        System.out.println("Student ID: " + s1.studentId);
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Age: " + s1.age);
        System.out.println("Grade: " + s1.grade);
        System.out.println("Student 2 Details:");
        System.out.println("Student ID: " + s2.studentId);
        System.out.println("Student Name: " + s2.studentName);
        System.out.println("Age: " + s2.age);
        System.out.println("Grade: " + s2.grade);
    }
}