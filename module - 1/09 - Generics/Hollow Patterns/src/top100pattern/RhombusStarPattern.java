package top100pattern;

import java.util.Scanner;

public class RhombusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        if (n<=0)
            return;
        for(int i = 0; i < n; i++){
            for (int j = 0; j<i; j++)
                System.out.print("  ");
            for (int j = 0; j<n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

// Output
// Enter any number: 5
// * * * * *
//   * * * * *
//     * * * * *
//       * * * * *
//         * * * * *