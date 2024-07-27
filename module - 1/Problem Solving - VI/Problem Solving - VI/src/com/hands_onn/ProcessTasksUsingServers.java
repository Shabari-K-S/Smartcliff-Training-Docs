package com.hands_onn;

import java.util.*;


public class ProcessTasksUsingServers {
    public static int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;
        int[] ans = new int[m];

        // Create a priority queue for available servers (sorted by weight and index)
        PriorityQueue<int[]> availableServers = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        // Create a priority queue for tasks in processing (sorted by free time, weight, and index)
        PriorityQueue<int[]> processingTasks = new PriorityQueue<>((a, b) -> {
            if (a[2] != b[2]) return a[2] - b[2];
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        // Initialize available servers with weights and indices
        for (int i = 0; i < n; i++) {
            availableServers.offer(new int[]{servers[i], i, 0});
        }

        // Process tasks
        for (int j = 0; j < m; j++) {
            int executionTime = tasks[j];

            // Pop servers that will be free at the current time
            while (!processingTasks.isEmpty() && processingTasks.peek()[2] <= j) {
                int[] server = processingTasks.poll();
                availableServers.offer(new int[]{server[0], server[1], server[2] + executionTime});
            }

            if (!availableServers.isEmpty()) {
                int[] server = availableServers.poll();
                ans[j] = server[1]; // Assign task j to server with index server[1]
                processingTasks.offer(new int[]{server[0], server[1], j + executionTime});
            } else {
                // No available servers, wait for the next free server
                int[] server = processingTasks.poll();
                ans[j] = server[1]; // Assign task j to server with index server[1]
                processingTasks.offer(new int[]{server[0], server[1], server[2] + executionTime});
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of server: ");
        int serverSize = sc.nextInt();
        System.out.print("Enter the elements of server: ");
        int[] servers = new int[serverSize];
        for (int i = 0; i < serverSize; i++) {
            servers[i] = sc.nextInt();
        }
        System.out.print("Enter the size of tasks: ");
        int taskSize = sc.nextInt();
        int[] tasks = new int[taskSize];
        System.out.print("Enter the elements of tasks: ");
        for (int i = 0; i < taskSize; i++) {
            tasks[i] = sc.nextInt();
        }

        int[] result = assignTasks(servers, tasks);

        System.out.println(Arrays.toString(result)); // Example output: [2, 2, 0, 2, 1, 2]
    }
}



