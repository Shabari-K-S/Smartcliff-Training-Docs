package com.hands_on;

import java.util.Scanner;

public class StudentGrades {
    public void findAverage(int n, int m, int[][] arr){
        System.out.println("Weighted Average Grades of Students: ");
        for(int i=0; i<n; i++){
            double sum = 0;
            for(int j=0; j<m; j++){
                sum += arr[i][j];
            }
            double avg = sum/m;
            System.out.println("Student "+(i+1)+": "+avg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of assignments: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            System.out.println("Enter the grades of Student "+(i+1)+": ");
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        StudentGrades sg = new StudentGrades();
        sg.findAverage(n, m, arr);

        sc.close();
    }
}