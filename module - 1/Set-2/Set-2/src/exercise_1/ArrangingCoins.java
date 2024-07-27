package exercise_1;

import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coins: ");
        int n = sc.nextInt();
        System.out.println("The number of complete rows of the staircase is: " + arrangeCoins(n));
        sc.close();
    }

    public static int arrangeCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;
            if (curr == n) {
                return (int) k;
            }
            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int) right;
    }
}
