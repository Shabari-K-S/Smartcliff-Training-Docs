/**
 * 18. The total number of students in a class are 90 out of which 45 are
 *     boys. If 50% of the total students secured grade 'A' out of which
 *     20 are boys, then write a program to calculate the total number
 *     of girls getting grade 'A'.
 * @author: Shabari K S
 */
package com.hands_on;
public class GradeACalculator {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int boysWithGradeA = 20;

        int totalGradeA = totalStudents / 2;

        int girlsWithGradeA = totalGradeA - boysWithGradeA;

        System.out.println("Total girls getting grade 'A': " + girlsWithGradeA);
    }
}
