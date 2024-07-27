/**
 * 14. Assist the teacher in analyzing the students' fruit preferences
 *     recorded as follows:
 *   a) Determine the total number of students in the school who like oranges
 *   b) Determine the total number of students in the school who
 *      like mangoes.
 *   c) Calculate the total number of students in the school
 *      overall.
 *   d) Determine whether the number of girls exceeds the
 *      number of boys. State 'true' or 'false'.
 *
 * @author: Shabari K S
 */

package com.hands_on;

public class TeacherAnalysis {
    public static void main(String[] args) {
        int girlsOrange = 136;
        int boysOrange = 128;
        int girlsMango = 240;
        int boysMango = 243;

        int totalOrange = girlsOrange + boysOrange;
        int totalMango = girlsMango + boysMango;
        int totalStudents = totalOrange + totalMango;
        int totalBoys = boysOrange + boysMango;
        int totalGirls = girlsOrange + girlsMango;

        System.out.println("Total number of students in the school who like oranges: " + totalOrange);
        System.out.println("Total number of students in the school who like mangoes: " + totalMango);
        System.out.println("Total number of students in the school overall: " + totalStudents);
        System.out.println("Whether the number of girls exceeds the boys: " + (totalGirls > totalBoys));
    }
}