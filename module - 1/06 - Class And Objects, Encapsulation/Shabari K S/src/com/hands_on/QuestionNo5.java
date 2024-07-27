package com.hands_on;

class School{
    private static int totalStudents;
    private static final int MAX_CAPACITY = 500;

    public static void enrollStudent(){
        totalStudents++;
    }

    public static int getTotalStudents(){
        return totalStudents;
    }
}

public class QuestionNo5 {
    public static void main(String[] args) {
        School.enrollStudent();
        School.enrollStudent();
        School.enrollStudent();
        System.out.println("Total Students: " + School.getTotalStudents());
    }
}