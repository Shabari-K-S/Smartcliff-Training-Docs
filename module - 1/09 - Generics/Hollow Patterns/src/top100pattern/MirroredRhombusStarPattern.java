package top100pattern;

import java.util.Scanner;

public class MirroredRhombusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i=0; i<n; i++){
            for (int j=n-i-1; j>0; j--){
                System.out.print("  ");
            }
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output
// Enter any number:
// 3
//     * * *
//   * * *
// * * *