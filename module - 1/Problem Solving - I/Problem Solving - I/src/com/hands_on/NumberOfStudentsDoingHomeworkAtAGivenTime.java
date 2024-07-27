package com.hands_on;

import java.util.Scanner;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static int numberOfStudentsDoingHomeworkAtAGivenTime(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] startTime = new int[n];
        int[] endTime = new int[n];
        System.out.println("Enter the start time of the students: ");
        for (int i = 0; i < n; i++) {
            startTime[i] = sc.nextInt();
        }
        System.out.println("Enter the end time of the students: ");
        for (int i = 0; i < n; i++) {
            endTime[i] = sc.nextInt();
        }
        System.out.print("Enter the query time: ");
        int queryTime = sc.nextInt();
        System.out.println("The number of students doing their homework at the given time is: "
                + numberOfStudentsDoingHomeworkAtAGivenTime(startTime, endTime, queryTime));
    }
}