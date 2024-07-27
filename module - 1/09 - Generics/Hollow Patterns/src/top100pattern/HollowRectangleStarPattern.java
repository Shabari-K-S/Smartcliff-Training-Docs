package top100pattern;

import java.util.Scanner;

public class HollowRectangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any length: ");
        int length = sc.nextInt();
        System.out.println("Enter any breadth: ");
        int breadth = sc.nextInt();
        for (int i=1; i<=length; i++){
            for (int j=1; j<=breadth; j++){
                if ( i==1 || j==1 || i == length || j == breadth)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

// Output
// Enter any length:
// 3
// Enter any breadth:
// 10
// * * * * * * * * * *
// *                 *
// * * * * * * * * * *