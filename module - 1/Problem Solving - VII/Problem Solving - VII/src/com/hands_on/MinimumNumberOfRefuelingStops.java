package com.hands_on;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumNumberOfRefuelingStops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the target: ");
            int target = sc.nextInt();
            System.out.print("Enter the startFuel: ");
            int startFuel = sc.nextInt();
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[][] stations = new int[n][2];
            if (n > 0)
                System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    stations[i][j] = sc.nextInt();
                }
            }
            System.out.println("The minimum number of refueling stops the car must make is "+minRefuelStops(target, startFuel, stations));
        }
    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int i = 0, res;
        for (res = 0; startFuel < target; res++) {
            while (i < n && stations[i][0] <= startFuel) {
                pq.add(stations[i++][1]);
            }
            if (pq.isEmpty()) {
                return -1;
            }
            startFuel += pq.poll();
        }
        return res;
    }
}