package top100pattern;

import java.util.Scanner;

public class RectangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any length: ");
        int length = sc.nextInt();
        System.out.println("Enter any breadth: ");
        int breadth = sc.nextInt();
        for (int i=0; i<length; i++){
            for (int j=0; j<breadth; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output
// Enter any length:
// 3
// Enter any breadth:
// 7
// * * * * * * *
// * * * * * * *
// * * * * * * *