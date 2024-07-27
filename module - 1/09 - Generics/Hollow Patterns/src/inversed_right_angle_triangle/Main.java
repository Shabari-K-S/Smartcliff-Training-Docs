package inversed_right_angle_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j=0; j <= n-i-1; j++) {
                if (i==0 || j==0 || j == n-i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
