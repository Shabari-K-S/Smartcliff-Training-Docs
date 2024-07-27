package top100pattern;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ParallelogramStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        for (int i=0; i<length;i++){
            for(int j=0;j<i; j++)
                System.out.print("  ");
            for(int j=0;j<breadth; j++)
                System.out.print("* ");
            System.out.println();

        }
    }
}

// Output:
// Enter the length:
// 3
// Enter the breadth:
// 7
// * * * * * * *
//   * * * * * * *
//     * * * * * * *