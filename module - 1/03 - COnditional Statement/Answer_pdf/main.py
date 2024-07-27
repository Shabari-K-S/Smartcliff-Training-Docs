import streamlit as st

st.title("Control Flow Statements")

st.markdown(
"""
### 1. Take values of length and breadth of a rectangle from user and check if it is square or not.
###### Sample Input: 
    5, 3
###### Sample Output: 
    Not a Square
###### Sample Input:
    7, 7
###### Sample Output: 
    Square

### Analysis
1. Take the input from the user.
2. Check if the length and breadth are equal.
3. If they are equal, print "Square", else print "Not a Square".

`Program: SquareOrNot.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the Breadth of the Rectangle: ");
        int breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("Square");
        }else{
            System.out.println("Not a square");
        }
    }
}
```

### Output
```bash
Enter the Length of the Rectangle: 5
Enter the Breadth of the Rectangle: 3
Not a square
```
"""
)

st.divider()

st.markdown(
"""
### 2. Write a program to check whether the given number is odd or even.
###### Sample Input: 
    20
###### Sample Output: 
    Even
###### Sample Input: 
    87
###### Sample Output: 
    Odd


### Analysis
1. Take the input from the user.
2. Check if the number is divisible by 2.
3. If the number is divisible by 2, print "Even", else print "Odd".

`Program : EvenOrOdd.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int userInput = sc.nextInt();
        if(userInput % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
```

### Output
```bash
Enter any number : 20
Even
```
"""
)

st.divider()

st.markdown(
"""
### 3. Write a program to get a number from the user and print whether it is positive, negative or zero.
###### Sample Input: 
    56
###### Sample Output: 
    positive
###### Sample Input:  
    -235
###### Sample Output: 
    negative


### Analysis
1. Take the input from the user.
2. Check if the number is greater than 0.
3. If the number is greater than 0, print "Positive".
4. If the number is less than 0, print "Negative".
5. If the number is equal to 0, print "Zero".

`Program : PositiveOrNegativeOrZero.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        if(userInput == 0) {
            System.out.println("Zero");
        } else if (userInput > 0) {
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }
    }
}
```

### Output
```bash
Enter any number: 56
Positive
```
"""
)

st.divider()

st.markdown(
"""
### 4. Write a program to check whether a kid is eligible for kinder garden school admission. If a child is of age 4 or more then he/she is eligible.
###### Sample Input: 
    4
###### Sample Output: 
    Eligible
###### Sample Input: 
    2
###### Sample Output: 
    Not Eligible


### Analysis
1. Take the input from the user.
2. Check if the age is greater than or equal to 4.
3. If the age is greater than or equal to 4, print "Eligible".
4. If the age is less than 4, print "Not Eligible".

`Program : isEligibleToAttendKinderGarden.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class isEligibleToAttendKinderGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of your child: ");
        int childAge = sc.nextInt();
        if  (childAge >= 4){
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
```

### Output
```bash
Enter the age of your child: 4
Eligible
```
"""
)

st.divider()

st.markdown(
"""
### 5. Write a program to find the mobile chosen is within the budget or not. To find the budget mobiles is based on the belowmentioned criteria,
> 1. **If the cost of the mobile chosen is less than or equal to 15000 then display it as `Mobile chosen is within the budget`**
> 1. **If the cost of the mobile chosen is greater than 15000 then display it as `Mobile chosen is beyond the budget`**
###### Sample Input: 
    12000
###### Sample Output: 
    Mobile chosen is within the budget
###### Sample Input: 
    22000
###### Sample Output: 
    Mobile chosen is beyond the budget


### Analysis
1. Take the input from the user.
2. Check if the cost of the mobile is less than or equal to 15000.
3. If the cost of the mobile is less than or equal to 15000, print "Mobile chosen is within the budget".
4. If the cost of the mobile is greater than 15000, print "Mobile chosen is beyond the budget".

`Program : MobileBudget.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class MobileBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the mobile: ");
        int mobileCost = sc.nextInt();
        if  (mobileCost <= 15000){
            System.out.println("Mobile chosen is within the budget");
        } else {
            System.out.println("Mobile chosen is beyond the budget");
        }
    }
}
```

### Output
```bash
Enter the cost of the mobile: 12000
Mobile chosen is within the budget
```
"""
)

st.divider()

st.markdown(
"""
### 6. Given 2 integer values, `a` and `b`, return their sum. However, `teen` values in the range 13…19 inclusive, are extra lucky. So, if either value is a teen, just return 19.
###### Sample Input: 
    3, 4
###### Sample Output: 
    7
###### Sample Input: 
    13, 8
###### Sample Output: 
    19

    
### Analysis
1. Take the input from the user.
2. Check if either of the numbers is a teen number.
3. If either of the numbers is a teen number, return 19.
4. If neither of the numbers is a teen number, return the sum of the numbers.

`Program : TeenSum.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class TeenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if  (a >= 13 && a <= 19 || b >= 13 && b <= 19){
            System.out.println(19);
        } else {
            System.out.println(a + b);
        }
    }
}
```

### Output
```bash
Enter the first number: 3
Enter the second number: 4
7
```
"""
)

st.divider()

st.markdown(
"""
### 7. Kumar is purchasing certain items in a store. While purchasing certain items, a discount of 10% is offered to his if the quantity purchased is more than 1000. Help, Kumar to calculate the total expenses.
###### Sample Input: 
    1200, 15.50
###### Sample Output: 
    16740.0
###### Sample Input: 
    200, 15.50
###### Sample Output: 
    3100.0


### Analysis
1. Take the input from the user.
2. Check if the quantity is greater than 1000.
3. If the quantity is greater than 1000, apply a 10% discount.
4. Calculate the total expenses.

`Program : DiscountOrNot.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class DiscountOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of items: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the price of each item: ");
        double price = sc.nextDouble();
        double totalExpenses = quantity * price;
        if  (quantity > 1000){
            totalExpenses = totalExpenses - (totalExpenses * 0.1);
        }
        System.out.println(totalExpenses);
    }
}
```

### Output
```bash
Enter the quantity of items: 1200
Enter the price of each item: 15.50
16740.0
```
"""
)

st.divider()

st.markdown(
"""
### 8. In Chai Sung’s family the birthright will be given to the firstborn as a custom. Who will get the birthright among his three sons Choi Sung, Moui Sung, and Bhoi Sung if their ages are the input values?
###### Sample Input: 
    34, 26, 18
###### Sample Output: 
    Choi Sung
###### Sample Input: 
    28, 16, 30
###### Sample Output: 
    Bhoi Sung

### Analysis
1. Take the input from the user.
2. Check the age of each son.
3. The son with the highest age will get the birthright.

`Program : BirthRight.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class BirthRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Choi Sung: ");
        int choiSung = sc.nextInt();
        System.out.print("Enter the age of Moui Sung: ");
        int mouiSung = sc.nextInt();
        System.out.print("Enter the age of Bhoi Sung: ");
        int bhoiSung = sc.nextInt();
        if  (choiSung > mouiSung && choiSung > bhoiSung){
            System.out.println("Choi Sung");
        } else if (mouiSung > choiSung && mouiSung > bhoiSung){
            System.out.println("Moui Sung");
        } else {
            System.out.println("Bhoi Sung");
        }
    }
}
```

### Output
```bash
Enter the age of Choi Sung: 34
Enter the age of Moui Sung: 26
Enter the age of Bhoi Sung: 18
Choi Sung
```
"""
)

st.divider()

st.markdown(
"""
### 9. Write a program to check error in marks entry while user enters the marks in the system. Consider Error as marks entered less than 0 and more than 100.
###### Sample Input: 
    83
###### Sample Output: 
    Valid entry
###### Sample Input: 
    101
###### Sample Output: 
    Invalid entry
###### Sample Input: 
    -6
###### Sample Output: 
    Invalid entry

    
### Analysis
1. Take the input from the user.
2. Check if the marks are between 0 and 100.
3. If the marks are between 0 and 100, print "Valid entry".
4. If the marks are less than 0 or greater than 100, print "Invalid entry".

`Program : MarksEntry.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class MarksEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if  (marks >= 0 && marks <= 100){
            System.out.println("Valid entry");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
```

### Output
```bash
Enter the marks: 83
Valid entry
```
"""
)

st.divider()

st.markdown(
"""
### 10. Write a program that accepts three numbers from the user and prints `increasing` if the numbers are in increasing order, `decreasing` if the numbers are in decreasing order, and `Neither increasing or decreasing order` otherwise.
###### Sample Input: 
    3 6 8
###### Sample Output: 
    Increasing order
###### Sample Input: 
    9 5 1
###### Sample Output: 
    Decreasing order
###### Sample Input: 
    4 9 2
###### Sample Output: 
    Neither increasing nor decreasing order

    
### Analysis
1. Take the input from the user.
2. Check if the numbers are in increasing order.
3. If the numbers are in increasing order, print "Increasing order".
4. If the numbers are in decreasing order, print "Decreasing order".
5. If the numbers are neither in increasing nor decreasing order, print "Neither increasing nor decreasing order".

`Program : IncreasingOrDecreasing.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if  (a < b && b < c){
            System.out.println("Increasing order");
        } else if (a > b && b > c){
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}
```

### Output
```bash
Enter the first number: 3
Enter the second number: 6
Enter the third number: 8
Increasing order
```
"""
)

st.divider()


st.markdown(
"""
### 11. Smith and John, grade 3 students playing number games. When Smith gives a number John will say the natural numbers up to that number but in reverse order. Shia, their friend will say the sum of those numbers. Help John and Smith with your program.
Sample Input: 
    4
Sample Output: 
    4 3 2 1 , 10
Sample Input: 
    7
Sample Output: 
    7 6 5 4 3 2 1 , 28

### Analysis
1. Take the input from the user.
2. Print the natural numbers up to the given number in reverse order.
3. Calculate the sum of the natural numbers.

`Program : NumberGame.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n; i >= 1; i--){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println(", " + sum);
    }
}
```

### Output
```bash
Enter the number: 4
4 3 2 1 , 10
```
"""
)

st.divider()

st.markdown(
"""
### 12. Kittu the `Giant Ant` has 100 rooms in its colony. All the ants in the colony can crawl from 1 room to another, from there to another and so on. But our `Kittu` has a special power that makes him to jump from one room to next 10th room directly. That is room no 1 to room no 11 or 3 to 13… But poor `Kittu` don’t know to calculate/find which room that he can jump next. Help him saying all the room numbers to climb up. His starting room number can be the input.

###### Sample Input: 
    2
###### Sample output: 
    2 12 22 32 … 92
###### Sample Input: 
    5
###### Sample Output: 
    5 15 25 35 … 95

### Analysis
1. Take the input from the user.
2. Print the room numbers that `Kittu` can jump to.

`Program : KittuJump.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class KittuJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int roomNumber = sc.nextInt();
        for(int i = roomNumber; i <= 100; i += 10){
            System.out.print(i+" ");
        }
    }
}
```

### Output
```bash
Enter any number: 2
2 12 22 32 42 52 62 72 82 92
```
"""
)

st.divider()

st.markdown(
"""
### 13. Write a program to print the numbers from 1 to 20 other than the given number. Input should be between 1 to 20.
###### Sample Input: 
    6
###### Sample Output: 
    1 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 19 20
###### Sample Input: 
    17
###### Sample Output: 
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 18 19 20
###### Sample Input: 
    23
###### Sample Output: 
    Invalid Input

### Analysis
1. Take the input from the user.
2. Print the numbers from 1 to 20 excluding the given number.
3. If the input is not between 1 and 20, print "Invalid Input".

`Program : PrintANumber.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class PrintANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        if(userInput > 20){
            System.out.println("Invalid Input");
            return;
        }
        for(int i = 1; i <= 20; i++ ){
            if (userInput == i){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
```

### Output
```bash
Enter any number: 2
1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
```

"""
)

st.divider()

st.markdown(
"""
### 14. Write a program to print only the numbers divisible by 3 and 5 for a given number from 1.
Sample Input: 
    20
Sample Output: 
    3 5 6 9 10 12 15 18 20
Sample Input: 
    40
Sample Output: 
    3 5 6 9 10 12 15 18 20 21 24 25 27 30 33 35 36 39 40

### Analysis
1. Take the input from the user.
2. Print the numbers divisible by 3 and 5 from 1 to the given number.

`Program : DivisibleByThreeOrFive.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class DivisibleByThreeOrFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        for (int i=1; i<=userInput; i++){
            if (i % 3 == 0 ){
                System.out.print(i + " ");
            } else if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
```

### Output
```bash
Enter a number: 20
3 5 6 9 10 12 15 18 20 
```
"""
)

st.divider()

st.markdown(
"""
### 15. Jack and Emma are playing a number game. Jack should say the sum of the numbers that Emma says. He should sum until Emma says `zero`. Help Emma to check if Jack is right or not by telling her the answer.
###### Sample Input: 
    2 5 9 4 0
###### Sample Output: 
    20
###### Sample Input: 
    6 8 2 5 3 9 0
###### Sample Output: 
    33

### Analysis
1. Take the input from the user.
2. Calculate the sum of the numbers until the user enters 0.

`Program : SumOfNumbers.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of input: ");
        int range = sc.nextInt();
        System.out.print("Enter "+ range + " numbers: ");
        int sum = 0;
        for(int i=0; i<range; i++){
            sum += sc.nextInt();
        }
        System.out.println("Sum of given number: "+ sum);
    }
}
```

### Output
```bash
Enter the range of input: 5
Enter 5 numbers: 1 2 3 4 5
Sum of given number: 15
```
"""
)

st.divider()

st.markdown(
"""
### 16. Write a program to print `odd` or `even` number series based on the given number. That is if the input is an odd number, then it should generate the odd number series from 1 to the given number inclusive. If it is even, then it should generate the series from 2 to that number.
###### Sample Input: 
    13
###### Sample Output: 
    1 3 5 7 9 11 13
###### Sample Input: 
    16
###### Sample Output: 
    2 4 6 8 10 12 14 16

### Analysis
1. Take the input from the user.
2. If the number is odd, print the odd numbers from 1 to the given number.
3. If the number is even, print the even numbers from 2 to the given number.

`Program : OddOrEvenSeries.java`

### Code
```java
package com.hands_on;

import java.util.Arrays;
import java.util.Scanner;

public class OddOrEvenSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int value=0;
        if (userInput % 2 == 0){
            value=2;
        }else{
            value=1;
        }
        for(int i=value; i<=userInput; i+=2){
            System.out.print(i + " ");
        }
    }
}
```

### Output
```bash
Enter any number: 20
2 4 6 8 10 12 14 16 18 20 
```
"""
)

st.divider()

st.markdown(
"""
### 17. Given a number, Find the factorial of the given number using iteratives.
###### Sample Input: 
    5
###### Sample Output: 
    120
###### Sample Input: 
    7
###### Sample Output: 
    5040

### Analysis
1. Take the input from the user.
2. Calculate the factorial of the given number using iteration.

`Program : FactorialOfNumber.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=userInput;i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+ userInput+" is "+ factorial);
    }
}
```

### Output
```bash
Enter any number: 5
Factorial of 5 is 120
```
"""
)

st.divider()

st.markdown(
"""
### 18. There is a movie club for under 20 in the city, where the entry is age restricted. Based on their age allow them into either `Cartoon Club` or `Teens Club`.
###### Sample Input: 
    10
###### Sample Output: 
    Cartoon Club
###### Sample Input: 
    15
###### Sample Output: 
    Teens Club
###### Sample Input: 
    -10
###### Sample Output: 
    Invalid Age
###### Sample Input: 
    25
###### Sample Output: 
    Not Allowed

### Analysis
1. Take the input from the user.
2. Check if the age is less than 0.
3. If the age is less than 0, print "Invalid Age".
4. If the age is less than 20, print "Cartoon Club".
5. If the age is greater than or equal to 20, print "Not Allowed".

`Program : MovieClub.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class MovieClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age < 0){
            System.out.println("Invalid Age");
        } else if (age <= 10) {
            System.out.println("Teen Club");
        } else if(age < 20){
            System.out.println("Cartoon Club");
        }else{
            System.out.println("Not Allowed");
        }
    }
}
```

### Output
```bash
Enter your age: 10
Teen Club
```

"""
)

st.divider()

st.markdown(
"""
### 19. Write a program if an integer variable currentNumber is odd, change its value so that it is now 3 times currentNumber plus 1, otherwise change its value so that it is now half of currentNumber.
###### Sample Input: 
    17
###### Sample Output: 
    52
###### Sample Input: 
    26
###### Sample Output: 
    13

    
### Analysis
1. Take the input from the user.
2. Check if the number is odd.
3. If the number is odd, multiply the number by 3 and add 1.
4. If the number is even, divide the number by 2.

`Program : ChangeNumber.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int currentNumber = sc.nextInt();
        if(currentNumber % 2 != 0){
            currentNumber = currentNumber * 3 + 1;
        }else{
            currentNumber = currentNumber / 2;
        }
        System.out.println(currentNumber);
    }
}
```

### Output
```bash
Enter any number: 17
52
```
"""
)

st.divider()


st.markdown(
"""
### 20. Write a program to read an integer variable ‘Code’. If the Code value is 1, read double values and print the sum. If the Code value is 2, read the integers and print the product. If the code value is 3, read the strings and join them.
###### Sample Input: 
    1, 24.50, 67.00
###### Sample Output: 
    91.5
###### Sample Input: 
    3, `Hello`, `World`
###### Sample Output: 
    HelloWorld

    
### Analysis
1. Take the input from the user.
2. Check the code value.
3. If the code value is 1, read double values and print the sum.
4. If the code value is 2, read the integers and print the product.
5. If the code value is 3, read the strings and join them.

`Program : CodeValue.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class CodeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code: ");
        int code = sc.nextInt();
        if(code == 1){
            System.out.print("Enter the first double value: ");
            double firstValue = sc.nextDouble();
            System.out.print("Enter the second double value: ");
            double secondValue = sc.nextDouble();
            System.out.println(firstValue + secondValue);
        }else if(code == 2){
            System.out.print("Enter the first integer value: ");
            int firstValue = sc.nextInt();
            System.out.print("Enter the second integer value: ");
            int secondValue = sc.nextInt();
            System.out.println(firstValue * secondValue);
        }else if(code == 3){
            System.out.print("Enter the first string: ");
            String firstString = sc.next();
            System.out.print("Enter the second string: ");
            String secondString = sc.next();
            System.out.println(firstString + secondString);
        }
    }
}
```

### Output
```bash
Enter the code: 1
Enter the first double value: 24.50
Enter the second double value: 67.00
91.5
```
"""
)

st.divider()

st.markdown(
"""
### 21. Once a baby lion lost his way in the jungle. An old deer took pity on him and planned to take him to his place. But the other deer and his other friends — rabbits, squirrels, and birds are scared so they accompanied. In the morning they counted themselves to see if the baby lion done any mischief. Help them to find it. Total number of animals, count of each (rabbit, deer, birds, and squirrels) in the morning are the inputs.
###### Sample Input: 
    240, 27,48,124,38
###### Sample Output: 
    Baby lion is mischievous
###### Sample Input: 
    250, 42,46,115,47
###### Sample Output: 
    Baby lion is well behaved
###### Sample Input: 
    120, 45,38,30, 27
###### Sample Output: 
    Counted wrongly

### Analysis
1. Take the input from the user.
2. Calculate the total number of animals.
3. Check if the baby lion is mischievous or well-behaved.

`Program : BabyLion.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class BabyLion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of animals: ");
        int totalAnimals = sc.nextInt();
        System.out.print("Enter the count of rabbits: ");
        int rabbits = sc.nextInt();
        System.out.print("Enter the count of deer: ");
        int deer = sc.nextInt();
        System.out.print("Enter the count of birds: ");
        int birds = sc.nextInt();
        System.out.print("Enter the count of squirrels: ");
        int squirrels = sc.nextInt();
        if(totalAnimals < rabbits + deer + birds + squirrels){
            System.out.println("Counted wrongly");
        }else if(totalAnimals > rabbits + deer + birds + squirrels ){
            System.out.println("Baby lion is mischievous");
        }else {
            System.out.println("Baby lion is well behaved");
        }
    }
}
```

### Output
```bash
Enter the total number of animals: 240
Enter the count of rabbits: 27
Enter the count of deer: 48
Enter the count of birds: 124
Enter the count of squirrels: 38
Baby lion is mischievous
```
"""
)

st.divider()

st.markdown(
"""
### 22. A store charges \$12 per item if you buy less than 10 items. If you buy between 10 and 99 items, the cost is \$10 per item. If you buy 100 or more items, the cost is \$7 per item. Write the logic that asks customer name, how many items they are buying and prints the customer’s name and total cost.
###### Sample Input: 
    Smith, 40
###### Sample Output: 
    Smith 400
###### Sample Input: 
    Eve, 111
###### Sample Output: 
    Eve 777

### Analysis
1. Take the input from the user.
2. Check the number of items purchased.
3. Calculate the total cost based on the number of items purchased.

`Program : StoreCharge.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class StoreCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter the count of items: ");
        int countOfItem = sc.nextInt();

        System.out.println("Name: "+ customerName);
        if (countOfItem < 10) {
            System.out.println("Price: "+ (countOfItem*12));
        } else if (countOfItem < 99) {
            System.out.println("Price: "+ (countOfItem*10));
        } else if (countOfItem > 100) {
            System.out.println("Price: "+ (countOfItem*7));

        }
    }
}
```

### Output
```bash
Enter the name: Shabari
Enter the count of items: 40
Name: Shabari
Price: 400
```
"""
)

st.divider()

st.markdown(
"""
### 23. Write a program to read a Coordinate Point in a XY Coordinate System and Determine its Quadrant.
###### Sample Input: 
    2 2
###### Sample Output: 
    1

### Analysis
1. Take the input from the user.
2. Check the quadrant of the given point.

`Program : Quadrant.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = sc.nextInt();
        if(x > 0 && y > 0){
            System.out.println("1");
        }else if(x < 0 && y > 0){
            System.out.println("2");
        }else if(x < 0 && y < 0){
            System.out.println("3");
        }else if(x > 0 && y < 0){
            System.out.println("4");
        }
    }
}
```

### Output
```bash
Enter the x coordinate: 2
Enter the y coordinate: 2
1
```
"""
)

st.divider()

st.markdown(
"""
### 24. Write a program to read a number N. Find the sum of odd and even numbers from 1 to N numbers (inclusive).
###### Sample Input: 
    10
###### Sample Output: 
    25 30
###### Sample Input: 
    15
###### Sample Output: 
    64 56

### Analysis
1. Take the input from the user.
2. Calculate the sum of odd and even numbers from 1 to N.

`Program : SumOfOddAndEven.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for(int i=1; i<=userInput; i++){
            if(i % 2 == 0){
                sumOfEven += i;
            }else{
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd + " " + sumOfEven);
    }
}
```

### Output
```bash
Enter any number: 10
25 30
```
"""
)

st.divider()

st.markdown(
"""
### 25. Reina and Sierra were playing a game. Reina would give out number, and Sierra must reverse the given number. Help Sierra by writing program to reverse the number. Note that Reina should give a five-digit number.
###### Sample Input:
    61987
###### Sample Output:
    78916
###### Sample Input:
    1234
###### Sample Output:
    Not a valid number

### Analysis
1. Take the input from the user.
2. Check if the number is a five-digit number.

`Program : ReverseNumber.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if(number < 10000 || number > 99999){
            System.out.println("Not a valid number");
        }else{
            int reverse = 0;
            while(number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }
            System.out.println(reverse);
        }
    }
}
```

### Output
```bash
Enter the number: 61987
78916
```
"""
)

st.divider()

st.markdown(
"""
### 26. Write a program to check whether the given number is prime or not.
###### Sample Input: 
    91
###### Sample Output: 
    No
###### Sample Input: 
    97
###### Sample Output: 
    Yes

### Analysis
1. Take the input from the user.
2. Check if the number is prime.

`Program : PrimeNumber.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        boolean isPrime = true;
        if(userInput < 2){
            isPrime = false;
        }else{
            for(int i=2; i<=userInput/2; i++){
                if(userInput % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```

### Output
```bash
Enter any number: 91
No
```
"""
)

st.divider()

st.markdown(
"""
### 27. Write a program to print all prime numbers between 1 and N(inclusive). N will be the input.
###### Sample Input: 
    5
###### Sample Output: 
    2 3 5

### Analysis
1. Take the input from the user.
2. Print all prime numbers between 1 and N.

`Program : SeriesOfPrimeNumber.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class SeriesOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();
        for(int i=2; i<=userInput; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
```

### Output
```bash
Enter any number: 5
2 3 5 
```
"""
)

st.divider()

st.markdown(
"""
### 28. A student will not be allowed to sit in exam if his/her attendance is less than 75%. Number of classes held, and the Number of classes attended are the inputs. Display the attendance percentage and the eligibility of the student for the exam. Allow the student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( `Y` or `N` ) only when the attendance is lacking and print accordingly.
###### Sample Input: 
    100, 80
###### Sample Output: 
    80% Allowed
###### Sample Input: 
    100, 60, N
###### Sample Output: 
    60% Not allowed
###### Sample Input: 
    100, 70, Y
###### Sample Output: 
    70% Allowed

### Analysis
1. Take the input from the user.
2. Calculate the attendance percentage.
3. Check if the student is allowed to sit for the exam.
4. If the attendance is less than 75%, ask the user if he/she has a medical cause.

`Program : StudentAttendance.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = sc.nextInt();
        double attendance = (classesAttended * 100.0) / classesHeld;
        System.out.println(attendance + "%");
        if(attendance < 75){
            System.out.print("Do you have a medical cause? (Y/N): ");
            String medicalCause = sc.next();
            if(medicalCause.equals("Y")){
                System.out.println(attendance + "% Allowed");
            }else{
                System.out.println(attendance + "% Not allowed");
            }
        }else{
            System.out.println(attendance + "% Allowed");
        }
    }
}
```
"""
)

st.divider()

st.markdown(
"""
### 29. Jessica teaches her students about how many days in a month, what is a leap year and how to find it. Write a program to help her by saying the answer (number of days in a month) to expect from the student for the given month number and the year.
###### Sample Input: 
    2, 2016
###### Sample Output: 
    February 2016 has 29 days
###### Sample Input: 
    7, 2020
###### Sample Output: 
    July 2020 has 31 days
###### Sample Input: 
    2, 2019
###### Sample Output: 
    February 2019 has 28 days

### Analysis
1. Take the input from the user.
2. Check if the given year is a leap year.
3. Calculate the number of days in the given month.

`Program : DaysInMonth.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        String monthName = "";
        int days = 0;
        switch(month){
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
        }
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
}
```

### Output
```bash
Enter the month number: 2
Enter the year: 2016
February 2016 has 29 days
```
"""
)

st.divider()

st.markdown(
"""
### 30. Riya's teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task. Spring - March to May, Summer - June to August, Autumn - September to November and, Winter - December to February. Month should be in the range 1 to 12. If not, the output should be "Invalid month".
###### Sample Input: 
    11
###### Sample Output: 
    Autumn
###### Sample Input: 
    13
###### Sample Output: 
    Invalid month

### Analysis
1. Take the input from the user.
2. Check the season corresponding to the given month.

`Program : Seasons.java`

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        String season = "";
        if(month < 1 || month > 12){
            season = "Invalid month";
        }else if(month >= 3 && month <= 5){
            season = "Spring";
        }else if(month >= 6 && month <= 8){
            season = "Summer";
        }else if(month >= 9 && month <= 11){
            season = "Autumn";
        }else{
            season = "Winter";
        }
        System.out.println(season);
    }
}
```

### Output
```bash
Enter the month number: 11
Autumn
```
"""
)
