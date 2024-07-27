package com.hands_on;

import java.util.Scanner;

public class CircleRectangleOverlap {
    public static boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int x = Math.max(x1, Math.min(xCenter, x2));
        int y = Math.max(y1, Math.min(yCenter, y2));
        int dx = x - xCenter;
        int dy = y - yCenter;
        return (dx * dx + dy * dy) <= radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();
        System.out.println("Enter the xCenter: ");
        int xCenter = sc.nextInt();
        System.out.println("Enter the yCenter: ");
        int yCenter = sc.nextInt();
        System.out.println("Enter the x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the y2: ");
        int y2 = sc.nextInt();
        if(checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2)){
            System.out.println("We can overlap circle with rectangle");
        } else {
            System.out.println("No we can't over lap circle with rectangle");
        }
    }
}
