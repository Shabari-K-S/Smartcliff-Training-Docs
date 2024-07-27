package com.Main;

import java.util.Arrays;
import java.util.Scanner;

public class MettingRooms {
    public static  boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; ++i) {
            var a = intervals[i - 1];
            var b = intervals[i];
            if (a[1] > b[0]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rooms you would like to attend: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        boolean canAttendMeetings = canAttendMeetings(intervals);
        if (canAttendMeetings) {
            System.out.println("Attend meetings");
        } else {
            System.out.println("Not attend meetings");
        }
    }
}

