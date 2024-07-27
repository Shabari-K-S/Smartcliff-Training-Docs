package com.hands_on;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MeetingRoomsIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the number of room: ");
            int n = sc.nextInt();
            System.out.print("Enter the size of the array: ");
            int m = sc.nextInt();
            int[][] meetings = new int[m][2];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    meetings[i][j] = sc.nextInt();
                }
            }
            System.out.println("The number of the room that held the most meetings is "+maxMeetingRooms(n, meetings));
        }
    }

    public static int maxMeetingRooms(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> busy
                = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> idle = new PriorityQueue<>();
        for (int i = 0; i < n; ++i) {
            idle.offer(i);
        }
        int[] cnt = new int[n];
        for (var v : meetings) {
            int s = v[0], e = v[1];
            while (!busy.isEmpty() && busy.peek()[0] <= s) {
                idle.offer(busy.poll()[1]);
            }
            int i = 0;
            if (!idle.isEmpty()) {
                i = idle.poll();
                busy.offer(new int[] {e, i});
            } else {
                var x = busy.poll();
                i = x[1];
                busy.offer(new int[] {x[0] + e - s, i});
            }
            ++cnt[i];
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (cnt[ans] < cnt[i]) {
                ans = i;
            }
        }
        return ans;
    }
}