package com.hands_on;

import java.util.*;

public class FSTHMNOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many query's needed: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the number of servers: ");
            int k = sc.nextInt();
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arrival = new int[n];
            int[] load = new int[n];
            System.out.print("Enter the elements of the arrival array: ");
            for (int i = 0; i < n; i++) {
                arrival[i] = sc.nextInt();
            }
            System.out.print("Enter the elements of the load array: ");
            for (int i = 0; i < n; i++) {
                load[i] = sc.nextInt();
            }
            System.out.println("The busiest server(s) is "+busiestServers(k, arrival, load));
        }
    }

    public static List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] counts = new int[k];
        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }
        PriorityQueue<int[]> busy = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < arrival.length; i++) {
            int time = arrival[i];
            int duration = load[i];
            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                available.add(busy.poll()[1]);
            }
            if (available.isEmpty()) {
                continue;
            }
            Integer server = available.ceiling(i % k);
            if (server == null) {
                server = available.first();
            }
            counts[server]++;
            available.remove(server);
            busy.add(new int[]{time + duration, server});
        }
        List<Integer> result = new ArrayList<>();
        int max = Arrays.stream(counts).max().getAsInt();
        for (int i = 0; i < k; i++) {
            if (counts[i] == max) {
                result.add(i);
            }
        }
        System.out.println(available + " "+ Arrays.toString(busy.element()));
        return result;
    }
}