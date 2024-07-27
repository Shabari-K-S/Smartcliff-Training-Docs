package com.hands_on;

import java.util.Scanner;

public class ReachingPoints {
    public static boolean reachingPoint(int sx, int sy, int tx, int ty,boolean flag){
        if (sx>tx || sy > ty){
            return false;
        } else if (sx == tx && sy == ty){
            return true;
        } else if (sx < tx && flag){
            return reachingPoint(sx + sy , sy, tx, ty, false);
        }  else if (sy < ty && !flag){
            return reachingPoint(sx, sx + sy , tx, ty,true);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of sx: ");
        int sx = sc.nextInt();
        System.out.print("Enter the value of sx: ");
        int sy = sc.nextInt();
        System.out.print("Enter the value of sx: ");
        int tx = sc.nextInt();
        System.out.print("Enter the value of : ");
        int ty = sc.nextInt();
        System.out.println(reachingPoint(sx,sy,tx,ty,false));
    }
}
