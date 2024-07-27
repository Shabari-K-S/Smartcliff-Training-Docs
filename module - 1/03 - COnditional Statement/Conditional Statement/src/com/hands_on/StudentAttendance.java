package com.hands_on;

import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = sc.nextInt();
        double attendance = (classesAttended * 100.0) / classesHeld;
        System.out.println(attendance + "%");
        if(attendance < 75){
            System.out.print("Do you have a medical cause? (Y/N): ");
            String medicalCause = sc.next();
            if(medicalCause.equals("Y")){
                System.out.println(attendance + "% Allowed");
            }else{
                System.out.println(attendance + "% Not allowed");
            }
        }else{
            System.out.println(attendance + "% Allowed");
        }
    }
}
