import streamlit as st 

st.title("Self Practice - Conditional Statements")

st.markdown(
"""
### 1. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount.
###### Sample Input: 
    20000, 7
###### Sample Output: 
    1000
###### Sample Input: 
    50000, 3
###### Sample Output: 
    0

### Analysis
1. Get the salary and year of service from the user
2. Check if the year of service is more than 5 years
3. If True, calculate the bonus amount
4. If False, print 0
5. Print the bonus amount

`Program : BonusSalary.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary amount: ");
        int salary = sc.nextInt();
        System.out.print("Enter your year of service: ");
        int yearOfService = sc.nextInt();
        int bonus = 0;
        if (yearOfService > 5){
            bonus = (int) (salary * 0.05);
        }
        System.out.println("Bonus Amount: "+ bonus);
    }
}
```

### Output
```bash
Enter the salary amount: 30000
Enter your year of service: 6
Bonus Amount: 1500
```
"""
)

st.divider()

st.markdown(
"""
### 2. Write a program to print absolute value of a number entered by user without using library method.
###### Sample Input: 
    1
###### Sample Output: 
    1
###### Sample Input: 
    -1
###### Sample Output: 
    1

### Analysis
1. Get the number from the user
2. Check if the number is negative
3. If True, print the absolute value of the number
4. If False, print the number

`Program : AbsoluteNumber.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = sc.nextInt();

        if (userInput < 0){
            userInput *= -1;
        }
        System.out.println("Absolute number of the given number: "+ userInput);
    }
}
```

### Output
```bash
Enter any number: -5
Absolute number of the given number: 5
```
"""
)

st.divider()

st.markdown(
"""
### 3. There is a group selection in a crowd for an event based on the entry ticket number. For every group, the group leader will be the one who’s ticket number has 10 as it’s factor. If anyone gives the ticket number tell him/her that they are a group leader or a group member.
###### Sample Input: 
    5423
###### Sample Output: 
    Group Member
###### Sample Input: 
    5610
###### Sample Output: 
    Group Leader

### Analysis
1. Get the ticket number from the user
2. Check if the ticket number is divisible by 10
3. If True, print "Group Leader"
4. If False, print "Group Member"

`Program : GroupSelection.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class GroupSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ticket number: ");
        int ticketNumber = sc.nextInt();

        if (ticketNumber % 10 == 0){
            System.out.println("Group Leader");
        } else {
            System.out.println("Group Member");
        }
    }
}
```

### Output
```bash
Enter the ticket number: 102930
Group Leader
```
"""
)

st.divider()

st.markdown(
"""
### 4. Ask user to enter age, and sex (M or F), then using following rules print their place of service.
1. **if employee is female, then she will work only in urban areas**
1. **if employee is a male and age is in between 20 to 40 then he may work in anywhere**
1. **if employee is male and age is in between 40 to 60 then he will work in urban areas only.**
1. **And any other input of age should print "ERROR".**
###### Sample Input: 
    26, F
###### Sample Output: 
    Urban Area
###### Sample Input: 
    30, M
###### Sample Output: 
    Anywhere

### Analysis
1. Get the input from the user
2. Check if employee is female, then print "Urban Area"
3. Check if employee is male and age is in between 20 to 40, then print "Anywhere"
4. Check if employee is male and age is in between 40 to 60, then print "Urban Area"
5. If any other input of age, print "ERROR"

`Program : PlaceOfService.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class PlaceOfService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter sex (M or F): ");
        char sex = scanner.next().charAt(0);
        sex = Character.toUpperCase(sex);

        if (sex == 'F') {
            System.out.println("Urban areas");
        } else if (sex == 'M') {
            if (age >= 20 && age <= 40) {
                System.out.println("Anywhere");
            } else if (age > 40 && age <= 60) {
                System.out.println("Urban areas");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
```

### Output
```bash
Enter age: 45
Enter sex (M or F): M
Urban areas
```
"""
)

st.divider()

st.markdown(
"""
### 5. Write a program to display the grade of a student based on his/her marks
"""
)

grades = {
    "Marks":[">90","81 to 90","71 to 80", "61 to 70", "50 t0 60", "<50"],
    "Grade":["O","A","B","C","D","E"]
}

st.dataframe(grades, width=500)

st.markdown(
"""
### Analysis
1. Get the marks from the user
2. Check the marks and assign the grade based on the marks
3. Print the grade

`Program : StudentGrade.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        String grade = "";
        if (marks > 90){
            grade = "O";
        } else if (marks >= 81 && marks <= 90){
            grade = "A";
        } else if (marks >= 71 && marks <= 80){
            grade = "B";
        } else if (marks >= 61 && marks <= 70){
            grade = "C";
        } else if (marks >= 50 && marks <= 60){
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade: "+ grade);
    }
}
```

### Output
```bash
Enter your marks: 90
Grade: A
```
"""
)

st.divider()

st.markdown(
"""
### 6. The policy followed by a company to process customer orders is given by the following rules: Suppose stock=100. If a customer order is less than or equal to that in stock and his credit is OK, supply his requirements. If his credit is not OK do not supply. Send him intimation. If his credit is OK but the item in stock is less than is order, supply the available stock and inform as ‘Out of stock. Balance will be refunded’.
###### Sample Input: 
    150, 100, ‘N’
###### Sample Output: 
    100 supplied
###### Sample Input: 
    150, 100, ‘Y’
###### Sample Output: 
    Cannot supply
###### Sample Input: 
    150, 200, ‘N’
###### Sample Output: 
    150 supplied. Out of stock. Balance will be refunded

### Analysis
1. Get the customer order, stock and credit status from the user
2. Check if the customer order is less than or equal to the stock and credit status is OK
3. If True, supply his requirements
4. If False, do not supply
5. If the credit status is OK but the item in stock is less than his order, supply the available stock and inform as ‘Out of stock. Balance will be refunded’.

`Program : CustomerOrder.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class CustomerOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer order: ");
        int customerOrder = sc.nextInt();
        System.out.print("Enter the stock: ");
        int stock = sc.nextInt();
        System.out.print("Enter the credit status (Y/N): ");
        char creditStatus = sc.next().charAt(0);
        creditStatus = Character.toUpperCase(creditStatus);

        if (customerOrder <= stock && creditStatus == 'Y'){
            System.out.println(customerOrder + " supplied");
        } else if (creditStatus == 'N'){
            System.out.println("Cannot supply");
        } else {
            System.out.println(stock + " supplied. Out of stock. Balance will be refunded");
        }
    }
}
```

### Output
```bash
Enter the customer order: 150
Enter the stock: 200
Enter the credit status (Y/N): Y
Cannot supply
```
"""
)

st.divider()

st.markdown(
"""
### 7. During lockdown, ATMs were allowed to dispatch currency bill in specific way. If user enters the amount, which is not multiple of 500 transactions will be rejected.
###### Sample Input: 
    3400 (assume balance is 10000)
###### Sample Output: 
    Please enter amount multiple of 500
###### Sample Input: 
    2000 (assume balance is 10000)
###### Sample Output: 
    Valid amount, transaction in process

### Analysis
1. Get the amount from the user
2. Check if the amount is multiple of 500
3. If True, print "Valid amount, transaction in process"
4. If False, print "Please enter amount multiple of 500"

`Program : ATMDuringLockdown.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class ATMDuringLockdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int balance = 10000;

        if (amount % 500 == 0){
            System.out.println("Valid amount, transaction in process");
        } else {
            System.out.println("Please enter amount multiple of 500");
        }
    }
}
```

### Output
```bash
Enter the amount: 3400
Please enter amount multiple of 500
```
"""
)

st.divider()

st.markdown(
"""
### 8. Create a program to display the `text` corresponding to a certain `numerical value`, using the following equivalence:
1. **9,10 = Excellent**
1. **7,8 = Notable**
1. **6 = Good**
1. **5 = Approved**
1. **0-4 = Fail**
1. **>10= Invalid**
###### Sample Input: 
    9
###### Sample Output: 
    Excellent
###### Sample Input: 
    3
###### Sample Output: 
    Fail

### Analysis
1. Get the numerical value from the user
2. Check the numerical value and assign the text based on the value
3. Print the text

`Program : NumericalValue.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class NumericValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerical value: ");
        int numericalValue = sc.nextInt();
        String text = "";

        if (numericalValue == 9 || numericalValue == 10){
            text = "Excellent";
        } else if (numericalValue == 7 || numericalValue == 8){
            text = "Notable";
        } else if (numericalValue == 6){
            text = "Good";
        } else if (numericalValue == 5){
            text = "Approved";
        } else if (numericalValue >= 0 && numericalValue <= 4){
            text = "Fail";
        } else {
            text = "Invalid";
        }
        System.out.println(text);
    }
}
```

### Output
```bash
Enter the numerical value: 7
Notable
```
"""
)

st.divider()

st.markdown(
"""
### 9. Write a program to perform the following:
a) Display the question “What is the unit of currency in India?”
b) Accept the answer
c) If the answer is wrong (other than Rupee) display “Try again!”.
d) If it is correct “Rupee” display the message “Answer is correct”.
e) If the user gives the correct answer in first two attempts the program will terminate.
f) If the user fails to provide correct answer in three attempts the program itself gives the answer.
Sample Input/Output:
What is the unit of currency in India? Rupee
Answer is correct
###### Sample Input/Output:
    What is the unit of currency in India? Euro
    Try again!
    Rupee
    Answer is correct
###### Sample Input/Output:
    What is the unit of currency in India? Yen
    Try again!
    Pound
    Try again!
    Euro
    Sorry it is Rupee

### Analysis
1. Display the question “What is the unit of currency in India?”
2. Accept the answer
3. If the answer is wrong (other than Rupee) display “Try again!”.
4. If it is correct “Rupee” display the message “Answer is correct”.

`Program : CurrencyUnit.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class CurrencyUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctAnswer = "Rupee";
        int attempt = 0;
        boolean isAnswerCorrect = false;

        while (attempt < 3 && !isAnswerCorrect){
            System.out.print("What is the unit of currency in India? ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(correctAnswer)){
                System.out.println("Answer is correct");
                isAnswerCorrect = true;
            } else {
                System.out.println("Try again!");
            }
            attempt++;
        }

        if (!isAnswerCorrect){
            System.out.println("Sorry it is Rupee");
        }
    }
}
```

### Output
```bash
What is the unit of currency in India? Euro
Try again!
What is the unit of currency in India? Pound
Try again!
What is the unit of currency in India? Rupee
Answer is correct
```
"""
)

st.divider()

st.markdown(
"""
### 10. Read N. Find the Sum of first N odd numbers.
###### Sample Input: 
    3
###### Sample Output: 
    9
###### Sample Input: 
    7
###### Sample Output: 
    49

### Analysis
1. Get the number N from the user
2. Find the sum of first N odd numbers
3. Print the sum

`Program : SumOfOddNumbers.java`

### Code
```java
package com.self_practice;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int sum = 0;
        int count = 1;

        for (int i = 1; i <= N; i++){
            sum += count;
            count += 2;
        }
        System.out.println("Sum of first "+ N +" odd numbers: "+ sum);
    }
}
```

### Output
```bash
Enter the number: 5
Sum of first 5 odd numbers: 25
```
"""
)


st.divider()

st.markdown(
"""
### 11. Write a program to print all possible outcomes with two dices (6 sides with digits 1 to 6)
###### Expected Output:
    (1,1)(1,2)(1,3)(1,4)(1,5)(1,6)
    (2,1)(2,2)(2,3)(2,4)(2,5)(2,6)
    (3,1)(3,2)(3,3)(3,4)(3,5)(3,6)
    (4,1)(4,2)(4,3)(4,4)(4,5)(4,6)
    (5,1)(5,2)(5,3)(5,4)(5,5)(5,6)
    (6,1)(6,2)(6,3)(6,4)(6,5)(6,6)

### Analysis
1. Loop through 1 to 6 for both dices
2. Print the possible outcomes

`Program : TwoDicePossible.java`

### Code:
```java
package com.self_practice;


public class TwoDicePossible {
    public static void main(String[] args) {
        for(int i=1;i<=6; i++){
            for(int j=1;j<=6;j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
    }
}
```

### Output
```bash
(1,1) (1,2) (1,3) (1,4) (1,5) (1,6) 
(2,1) (2,2) (2,3) (2,4) (2,5) (2,6) 
(3,1) (3,2) (3,3) (3,4) (3,5) (3,6) 
(4,1) (4,2) (4,3) (4,4) (4,5) (4,6) 
(5,1) (5,2) (5,3) (5,4) (5,5) (5,6) 
(6,1) (6,2) (6,3) (6,4) (6,5) (6,6) 
```

"""
)

st.divider()

st.markdown(
"""
### 12. Write a program to print the multiplication table from 1 to N (where N is a number entered by user).
###### Sample Input: 
    10
###### Sample Output:
```
.
 1   2   3   4   5   6   7   8   9  10 
 2   4   6   8  10  12  14  16  18  20 
 3   6   9  12  15  18  21  24  27  30 
 4   8  12  16  20  24  28  32  36  40 
 5  10  15  20  25  30  35  40  45  50 
 6  12  18  24  30  36  42  48  54  60 
 7  14  21  28  35  42  49  56  63  70 
 8  16  24  32  40  48  56  64  72  80 
 9  18  27  36  45  54  63  72  81  90 
10  20  30  40  50  60  70  80  90 100 
```

### Analysis
1. Get the number from the user
2. Loop through 1 to N
3. Print the multiplication table

`Program : Tables.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int table = sc.nextInt();
        for(int i=1;i<=table;i++){
            for(int j=1;j<=10;j++){
                System.out.format("%3d ", i*j);
            }
            System.out.println();
        }
    }
}
```

### Output
```
.
  1   2   3   4   5   6   7   8   9  10 
  2   4   6   8  10  12  14  16  18  20 
  3   6   9  12  15  18  21  24  27  30 
  4   8  12  16  20  24  28  32  36  40 
  5  10  15  20  25  30  35  40  45  50 
  6  12  18  24  30  36  42  48  54  60 
  7  14  21  28  35  42  49  56  63  70 
  8  16  24  32  40  48  56  64  72  80 
  9  18  27  36  45  54  63  72  81  90 
 10  20  30  40  50  60  70  80  90 100 
```

"""
)

st.divider()

st.markdown(
"""
### 13. Write a program to print the following star pattern
###### Sample Input: 
    5
###### Sample Output:
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 

### Analysis
1. Get the number from the user
2. Loop through the range
3. Print the star pattern

`Program : StarPatternRightAngleTriangle.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class StarPatternRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int range = sc.nextInt();
        for(int i=0;i<range;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### Output
```
* 
* * 
* * * 
* * * * 
* * * * * 
```

"""
)

st.divider()

st.markdown(
"""
### 14.  Write a program to print the following pattern
###### Sample Input: 
    5
###### Sample Output:
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 

### Analysis
1. Get the number from the user
2. Loop through the range
3. Print the number pattern

`Program : NumberPatternRightAngleTriangle.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class NumberPatternRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int range = sc.nextInt();
        for(int i=0;i<range;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
```

### Output
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

"""
)

st.divider()

st.markdown(
"""
### 15. Write a program to print the following pattern
###### Sample Input: 
    5
###### Sample Output:
```
* * * * *
* * * * 
* * * 
* * 
* 
```

### Analysis
1. Get the number from the user
2. Loop through the range
3. Print the star pattern

`Program : StarPatternInvertedRightAngleTriangle.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class StarPatternInvertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int range = sc.nextInt();
        for(int i=range;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### Output
```
* * * * *
* * * *
* * *
* *
*
```

"""
)

st.divider()

st.markdown(
"""
### 16. A person pays tax 10% if his income is more than 2.5 lacs for the amount excess to 2.5 lacs. Person having annual income lesser than 2.5 lac is exempted from tax. Write a program to implement it.
###### Sample Input: 
    200000
###### Sample Output: 
    You are exempted from tax
###### Sample Input: 
    400000
###### Sample Output: 
    Tax amount is 15000

### Analysis
1. Get the income from the user
2. Check if the income is more than 2.5 lacs
3. If True, calculate the tax amount
4. If False, print "You are exempted from tax"

`Program : IncomeTax.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        int income = sc.nextInt();
        int taxAmount = 0;
        if (income > 250000){
            taxAmount = (int) ((income - 250000) * 0.10);
            System.out.println("Tax amount is "+ taxAmount);
        } else {
            System.out.println("You are exempted from tax");
        }
    }
}
```

### Output
```bash
Enter your annual income: 300000
Tax amount is 5000
```

"""
)

st.divider()

st.markdown(
"""
### 17. Read total shopping amount purchased in the shop, and then apply the discount as per the following discount criteria, then find and print the final amount that must be paid by the customer after subtracting the discount amount:
"""
)

data = {
    "Shopping" :["5000 and Above", "1000 - 4999", "Below 1000"],
    "Amount Discount%":["25%", "10%", "0%"]
}

st.dataframe(data, width=500)

st.markdown(
"""
### Analysis
1. Get the total shopping amount from the user
2. Check the shopping amount and apply the discount
3. Calculate the final amount to be paid by the customer

`Program : ShoppingDiscount.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total shopping amount: ");
        int shoppingAmount = sc.nextInt();
        int discountAmount = 0;
        if (shoppingAmount >= 5000){
            discountAmount = (int) (shoppingAmount * 0.25);
        } else if (shoppingAmount >= 1000 && shoppingAmount <= 4999){
            discountAmount = (int) (shoppingAmount * 0.10);
        }
        System.out.println(
            "Final amount to be paid: "+ (shoppingAmount - discountAmount)
        );
    }
}
```

### Output
```bash
Enter the total shopping amount: 6000
Final amount to be paid: 4500
```

"""
)

st.divider()

st.markdown(
"""
### 18. Write a program to read date of birth as input & calculate the age.
###### Sample Input: 
    4 7 1989
###### Sample Output: 
    33 years 2 months 3 days 
    (May differ. This result is calculated on 14-Sep-2022)

### Analysis
1. Get the date of birth from the user
2. Calculate the age
3. Print the age

`Program : CalculateAge.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        System.out.println(
                "Age: "+ period.getYears()
                + " years " + period.getMonths()
                + " months " + period.getDays() + " days"
        );
    }
}
```

### Output
```bash
Enter your date of birth (dd mm yyyy): 4 7 1989
Age: 33 years 2 months 10 days
```

"""
)

st.divider()

st.markdown(
"""
### 19. Write a Java program to calculate frequency of digits in a number
###### Sample Input: 
    34593334
###### Sample Output:
    3 occurs 4 times
    4 occurs 2 times
    5 occurs 1 times
    9 occurs 1 times

### Analysis
1. Get the number from the user
2. Calculate the frequency of digits in the number
3. Print the frequency of digits

`Program : FrequencyOfDigits.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int[] frequency = new int[10];
        while (number > 0){
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        for (int i=0;i<10;i++){
            if (frequency[i] > 0){
                System.out.println(
                    i + " occurs " 
                    + frequency[i] + " times"
                );
            }
        }
    }
}
```

### Output
```bash
Enter any number: 34593334
3 occurs 4 times
4 occurs 2 times
5 occurs 1 times
9 occurs 1 times
```

"""
)

st.divider()

st.markdown(
"""
### 20. To check whether the given number is Armstrong number or not. Armstrong number in 3-digit numbers is a number whose sum of cubes of each digit is equal to the number itself. For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
###### Sample Input: 
    153
###### Sample Output: 
    true
###### Sample Input: 
    121
###### Sample Output: 
    false

### Analysis
1. Get the number from the user
2. Check if the number is Armstrong number
3. Print the result

`Program : ArmstrongNumber.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println(temp == sum);
    }
}
```

### Output
```bash
Enter any number: 153
true
```

"""
)

st.divider()

st.markdown(
"""
### 21. During lockdown, ATMs were allowed to dispatch currencies in specific way. If user enters the amount, which is not multiple of 500 transactions will be rejected. If amount is 500 exactly, then 5 currencies of 100 will be dispatched by machine.
###### Sample Input: 
    500
###### Sample Output: 
    please dispatch 5 notes of 100
###### Sample Input: 
    300
###### Sample Output: 
    please enter the amount multiple of 500

### Analysis
1. Get the amount from the user
2. Check if the amount is multiple of 500
3. If True, check if the amount is 500
4. If True, dispatch 5 notes of 100
5. If False, print "please enter the amount multiple of 500"

`Program : ATMDuringLockdown.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class ATMDuringLockdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        if (amount % 500 == 0){
            if (amount == 500){
                System.out.println("please dispatch 5 notes of 100");
            } else {
                System.out.println("please enter the amount multiple of 500");
            }
        }
    }
}
```

### Output
```bash
Enter the amount: 500
please dispatch 5 notes of 100
```

"""
)

st.divider()

st.markdown(
"""
### 22. A person pays tax 10% if his income is between 2.5 to 5 lacs. On the amount greater than that 20% for 5 to 12 lacs, for amount above 12 lacs 30%. Person will enter the amount input and will get tax amount as output.
###### Sample Input: 
    200000
###### Sample Output: 
    You are exempted from tax
###### Sample Input: 
    40000
###### Sample Output: 
    Tax amount is 15000
###### Sample Input: 
    800000
###### Sample Output: 
    85000
###### Sample Input: 
    1300000
###### Sample Output: 
    195000

### Analysis
1. Get the income from the user and calculate the tax amount based on the income
2. Print the tax amount

`Program : IncomeTax.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        int income = sc.nextInt();
        int taxAmount = 0;
        if (income > 250000 && income <= 500000){
            taxAmount = (int) ((income - 250000) * 0.10);
        } else if (income > 500000 && income <= 1200000){
            taxAmount = (int) ((income - 500000) * 0.20 + 25000);
        } else if (income > 1200000){
            taxAmount = (int) ((income - 1200000) * 0.30 + 125000);
        }
        System.out.println(taxAmount);
    }
}
```

### Output
```bash
Enter your annual income: 1300000
195000
```

"""
)

st.divider()

st.markdown(
"""
### 23. In an E-commerce website, there is an offer coupon for books worth Rs. 500 as a special promotion. There is also a separate discount for books, and it is 10%. Apply the max discount between coupon offer and individual discount for books in the final invoice. The user purchases the below book. Calculate the final bill amount to be paid by the user.

Harry potter book - 1 no. - Rs. 750

### Analysis
1. Get the book price from the user
2. Check if the book price is greater than 500
3. If True, apply the discount of 10%
4. If False, apply the coupon offer
5. Print the final bill amount

`Program : BookDiscount.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class BookDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book price: ");
        int bookPrice = sc.nextInt();
        int discount = 0;
        if (bookPrice > 500){
            discount = (int) (bookPrice * 0.10);
        } else {
            discount = 500;
        }
        System.out.println("Final bill amount: "+ (bookPrice - discount));
    }
}
```

### Output
```bash
Enter the book price: 750
Final bill amount: 675
```

"""
)

st.divider()

st.markdown(
"""
### 24. During lockdown, ATMs were allowed to dispatch currencies in specific way. If user enters the amount, which is not multiple of 500 transactions will be rejected. If amount is 500 exactly, then 5 currencies of 100 will be dispatched by machine. If amount is between 500 to 2000 you will get 500 in the form of 100s currencies, rest 500s currencies. If amount is greater than 2000, then 2000 currencies will be dispatched and rest will be dispatched in the denomination of 500, last 500 will be in the denomination of 100.
###### Sample Input: 
    400
###### Sample Output: 
    please enter the amount multiple of 500
###### Sample Input: 
    500
###### Sample Output: 
    5 notes of 100
###### Sample Input: 
    1500
###### Sample Output: 
    5 notes on 100 & 2 notes on 500
###### Sample Input: 
    5000
###### Sample Output: 
    5 notes on 100, 2 notes of 2000, 1 notes of 500

### Analysis
1. Get the amount from the user
2. Check if the amount is multiple of 500
3. If True, check if the amount is 500
4. If True, dispatch 5 notes of 100
5. If False, check if the amount is between 500 to 2000
6. If True, dispatch 5 notes of 100 and rest 500s currencies
7. If False, dispatch 2000 currencies and rest will be dispatched in the denomination of 500, last 500 will be in the denomination of 100.

`Program : ATMDuringLockdown1.java`

### Code:
```java
package com.self_practice;

import java.util.Scanner;

public class ATMDuringLockdown1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] notes = {2000, 500, 100};
        int count = 0, i = 0;
        while (i < 3){
            if (amount >= notes[i]){
                count = amount % notes[i];
                System.out.println(count + " notes on "+ notes[i]);
                amount = amount % notes[i];
            }
            i++;
        }
    }
}
```

### Output
```bash
Enter the amount: 5000
5 notes on 100
2 notes on 500
2 notes on 2000
```

"""
)