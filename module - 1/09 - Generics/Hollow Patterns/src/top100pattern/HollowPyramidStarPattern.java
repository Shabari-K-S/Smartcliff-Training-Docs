package top100pattern;

import java.util.Scanner;

public class HollowPyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=n-i-1; j>0; j--)
                System.out.print("  ");
            for(int j=0; j < 2*i+1; j++) {
                if (i == n - 1 || j == 2 * i || j==0)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
