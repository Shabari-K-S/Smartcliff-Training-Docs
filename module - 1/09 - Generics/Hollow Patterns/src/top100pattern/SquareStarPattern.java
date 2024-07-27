package top100pattern;

import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if (n<=0)
            return;
        sc.close();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

// Output:
// Enter any number: 5
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *