package com.self_practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    private LinkedList<String> students = new LinkedList<String>();

    public void addStudent(String name) {
        students.add(name);
    }

    public boolean removeStudent(String name) {
        return students.remove(name);
    }

    public void removeStudentsByAge(int age) {
        students.removeIf(student -> student.contains(String.valueOf(age)));
    }

    public boolean searchStudent(String name) {
        return students.contains(name);
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public void listStudents() {
        students.forEach(System.out::println);
    }

    public int size() {
        return students.size();
    }

    public void iterateStudents() {
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String[] convertToArray() {
        return students.toArray(new String[0]);
    }

    public Iterator<String> getIterator() {
        return students.iterator();
    }

    public Iterator<String> getDescendingIterator() {
        return students.descendingIterator();
    }

    public void sortStudentsByName() {
        students.sort(String::compareTo);
    }

    public void sortStudentsByAge() {
        students.sort((student1, student2) -> Integer.parseInt(student1.split(":")[1]) - Integer.parseInt(student2.split(":")[1]));
    }

    public void clearStudents(){
        students.clear();
    }

    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list.addStudent("Student1:20");
        list.addStudent("Student2:25");
        list.addStudent("Student3:30");

        list.listStudents();
        list.removeStudent("Student2:25");
        list.listStudents();

        System.out.println(list.searchStudent("Student1:20"));
        System.out.println(list.searchStudent("Student2:25"));

        System.out.println(list.size());

        list.iterateStudents();

        String[] studentNames = list.convertToArray();
        for (String name : studentNames) {
            System.out.println(name);
        }

        Iterator<String> iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.removeStudentsByAge(20);
        list.listStudents();

        System.out.println(list.isEmpty());

        list.addStudent("Student4:35");
        list.addStudent("Student5:40");
        list.addStudent("Student6:45");

        list.listStudents();

        System.out.println(list.size());

        list.removeStudentsByAge(30);

        list.listStudents();

        System.out.println(list.isEmpty());

        list.sortStudentsByName();

        list.listStudents();

        list.sortStudentsByAge();

        list.listStudents();

        list.addStudent("Student7:50");

        list.listStudents();

        list.clearStudents();

        list.listStudents();

        System.out.println(list.isEmpty());
    }
}