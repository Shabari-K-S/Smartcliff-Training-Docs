from streamlit import *

title("Set - Exercise 1")

divider()

markdown(
"""
### 1. Arranging Coins
##### Problem Statement :
You have n coins and you want to build a staircase with these coins. The staircase 
consists of k rows where the ith row has exactly i coins. The last row of the 
staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will 
build

### Analysis
- The number of coins required to build a staircase with k rows is the sum of the first k natural numbers.
- The sum of the first k natural numbers is given by the formula k(k+1)/2
- We need to find the maximum value of k such that k(k+1)/2 <= n
- This can be done using binary search

### Code
```java
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
```

### Output
```
Enter the number of coins: 5
The number of complete rows of the staircase is: 2
```
"""
)

divider()

markdown(
"""
### 2. Number Of Vehicles
##### Problem Statement : 
There is a person named Bob who is the mayor of a state. 
He wants to find the maximise number of vehicles that can be registered in his 
state.

A vehicle normally has a registration number like ST 01 AB 1234. Each 
registration number has four parts, separated by spaces. The first part has two 
letters common for all cars in the state. The next two-digit number is the number 
of the district where the car is registered within the state. It is always two digits 
and may have a leading zero. After that, the next part consists of two letters 
(AB), with each letter selected from a range, denoting the series and the last part 
is a 4-digit number this will always be four digits, even if it has leading zeros).
The entire registration number is unique to each vehicle. You have been given the 
number of districts in the state, a range of letters to be used in the series and a 
set of digits that can be used for forming a vehicle registration number.
Your task is to find the maximum number of vehicles that can be registered in 
Bob’s state.

### Analysis
- The number of vehicles that can be registered in Bob's state is the product of the number of districts, the number of letters in the first part, the number of letters in the second part, and the number of digits in each part.
- The number of letters in the first part is the difference between the ASCII values of the two letters.
- The number of letters in the second part is the difference between the ASCII values of the two letters.
- The number of digits in each part is the number of digits in the range.
- The number of vehicles is the product of the number of districts, the number of letters in the first part, the number of letters in the second part, and the number of digits in each part.

### Code
```java
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
```

### Output
```
Enter the number of districts: 4
Enter the range of letters: A C B D
Enter the range of digits: 5 4 3 4
The maximum number of vehicles that can be registered in Bob's state is: 21600
```
"""
)

divider()