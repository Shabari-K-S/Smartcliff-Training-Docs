package com.self_practice;

import java.util.HashSet;
import java.util.Scanner;

public class PathCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String path = sc.next();
        System.out.println("Path crossing: " + isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");
        int x = 0, y = 0;
        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
            String point = x + "," + y;
            if (visited.contains(point)) return true;
            visited.add(point);
        }
        return false;
    }
}