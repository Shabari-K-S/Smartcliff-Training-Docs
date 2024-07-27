package top100pattern;

import java.util.Scanner;

public class HollowSquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();
        if (n<=0)
            return;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

// Output:
// Enter any number: 5
// * * * * *
// *       *
// *       *
// *       *
// * * * * *