package exercise_1;

import java.util.Scanner;

public class NumberOfVehicles {
    public static int numberOfVehicles(int districtCount, char alpha1, char alpha2, char alpha3, char alpha4, int dig1, int dig2, int dig3, int dig4) {
        int alpha1count=0;
        int alpha2count=0;
        int digit1count=0;
        int digit2count=0;
        int digit3count=0;
        int digit4count=0;
        for(char i = alpha1 ;i<=alpha2;i++){
            alpha1count++;
        }
        for(char i = alpha3 ;i<=alpha4;i++){
            alpha2count++;
        }
        for(int i=0;i<=dig1;i++){
            digit1count++;
        }
        for(int i=0;i<=dig2;i++){
            digit2count++;
        }
        for(int i=0;i<=dig3;i++){
            digit3count++;
        }
        for(int i=0;i<=dig4;i++){
            digit4count++;
        }
        int multiply = districtCount *alpha1count*alpha2count*digit1count*digit2count*digit3count*digit4count;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of districts: ");
        int districtCount = sc.nextInt();
        System.out.print("Enter the range of letters: ");
        char alpha1 = sc.next().charAt(0);
        char alpha2 = sc.next().charAt(0);
        char alpha3 = sc.next().charAt(0);
        char alpha4 = sc.next().charAt(0);
        System.out.print("Enter the range of digits: ");
        int dig1 = sc.nextInt();
        int dig2 = sc.nextInt();
        int dig3 = sc.nextInt();
        int dig4 = sc.nextInt();
        System.out.println("The maximum number of vehicles that can be registered in Bob's state is: " + numberOfVehicles(districtCount, alpha1, alpha2, alpha3, alpha4, dig1, dig2, dig3, dig4));
        sc.close();
    }
}