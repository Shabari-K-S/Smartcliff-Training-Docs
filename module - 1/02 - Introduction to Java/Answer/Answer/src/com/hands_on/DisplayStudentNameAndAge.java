/**
 * 7.Create two variables to store a student's name and his/her age.
 *   Assign/initialize them with the appropriate values and display
 *   the data.
 *
 * @author : Shabari K S
 */

package com.hands_on;
import java.util.Scanner;

public class DisplayStudentNameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Student = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(Student + "\n" + age);
    }
}
