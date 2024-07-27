package com.hands_on;

import user.collection.ArrayListADT;
import java.util.Scanner;

public class ArrayListMenuApp {

    public final static String Blue ="\u001B[34m";
    public final static String Cyan = "\u001B[36m";
    public final static String Red = "\u001B[31m";
    public final static String Green = "\u001B[32m";
    public final static String Yellow = "\u001B[33m";
    public final static String Magenta = "\u001B[35m";
    public final static String Reset = "\u001B[0m";

    static Scanner sc = new Scanner(System.in);
    private static final ArrayListADT<Integer> list = new ArrayListADT<>();

    public static void insert() {
        System.out.println(Blue);
        System.out.println("\tHow to insert an element?\n");
        System.out.println("\t1. Insert Beginning");
        System.out.println("\t2. Insert End");
        System.out.println("\t3. Insert at Specific Position");
        System.out.println("\t4. Exit");
        System.out.println(Reset);
        System.out.print("\tEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(Cyan + "\t\tInsert Beginning : ");
                System.out.print("\t\tEnter the element to insert: " + Reset);
                list.add(0, sc.nextInt());
                break;
            case 2:
                System.out.println(Cyan + "\t\tInsert End : ");
                System.out.print("\t\tEnter the element to insert: " + Reset);
                list.add(sc.nextInt());
                break;
            case 3:
                System.out.println(Cyan + "\t\tInsert End : ");
                System.out.print("\t\tEnter the element to insert: " + Reset);
                int val = sc.nextInt();
                System.out.print("\t\tEnter the element position: ");
                int pos = sc.nextInt();
                list.add(val, pos);
                break;
            case 4:
                System.out.println(Red + "\t\tExiting Insertion" + Reset);
                break;
            default:
                System.out.println(Cyan + "\t\tInvalid choice" + Reset);
        }
    }

    public static void delete() {
        System.out.println(Blue);
        System.out.println("\tHow to delete an element?\n");
        System.out.println("\t1. Delete Beginning");
        System.out.println("\t2. Delete End");
        System.out.println("\t3. Delete at Specific Position");
        System.out.println("\t4. Exit");
        System.out.println(Reset);
        System.out.print("\tEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(Cyan + "\n\tDeleted the First Element" + Reset);
                list.remove(0);
                break;
            case 2:
                System.out.println(Cyan + "\n\tDeleted the Last Element " + Reset);
                list.remove();
                break;
            case 3:
                System.out.println(Cyan + "\n\tDelete at Specific Position : " );
                System.out.print("\tEnter the element position: " + Reset);
                int pos = sc.nextInt();
                list.remove(pos);
                break;
            case 4:
                System.out.println(Red + "\tExiting Deletion" + Reset);
                break;
            default:
                System.out.println(Red + "\tInvalid choice" + Reset);
        }
    }

    public static void banner() {
        System.out.println(Yellow);
        System.out.println("==========================================");
        System.out.println("========  ArrayList Operations  ==========");
        System.out.println("==========================================");
        System.out.println(Reset + Cyan);
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Display");
        System.out.println("4. Size of LinkedList");
        System.out.println("5. isEmpty");
        System.out.println("6. Exit");
        System.out.println(Reset);
    }
    public static void main(String[] args) {
        loop:
        while (true) {
            banner();
            System.out.print(Cyan + "Enter your choice : " + Reset);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    System.out.println(Yellow);
                    list.display();
                    System.out.println(Reset);
                    break;
                case 4:
                    System.out.println(Magenta +"The Size of LinkedList : " + Yellow +list.size() + Reset);
                    break;
                case 5:
                    System.out.println(Magenta +"isEmpty : " + Yellow +list.isEmpty() + Reset);
                    break;
                case 6:
                    System.out.println(Red + "Exiting Program" + Reset);
                    break loop;
                default:
                    System.out.println( Red + "Invalid choice" + Reset);
            }
        }

    }
}
