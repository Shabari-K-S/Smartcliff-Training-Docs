package com.hands_on;

import java.util.Scanner;

public class RegisterStudents {
    public void findCommonStudents(int n, int[] nss, int[] ncc){
        System.out.println("Students who registered for both NSS and NCC: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nss[i] == ncc[j]){
                    System.out.print(nss[i]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        System.out.println("Enter the student ids for NSS: ");
        int[] nss = new int[n];
        for(int i=0; i<n; i++){
            nss[i] = sc.nextInt();
        }

        System.out.println("Enter the student ids for NCC: ");
        int[] ncc = new int[n];
        for(int i=0; i<n; i++){
            ncc[i] = sc.nextInt();
        }

        RegisterStudents rs = new RegisterStudents();
        rs.findCommonStudents(n, nss, ncc);

        sc.close();
    }
}