import streamlit as st

st.title("Analyze Of Hands-On Introduction to Java")

st.subheader("**1.Initialize an integer variable `number` with the value 100. Then print the value of `number` to the console.**")
st.markdown(
"""
### Analysis
 In this program, we have initialized an integer variable `number` with the value 100.

### Code
```java
package com.hands_on;

public class PrintANumber {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
    }
}

```
#### Output
```bash
100
```
""")

st.divider()

st.subheader("**2. Initialize two integer variables `six` and `four` with the values as the name says. Then, print the values of `six` and `four` to the console.**")

st.markdown(
"""
### Analysis
In this program, we have initialized two integer variables `six` and `four` with the values 6 and 4 respectively.

### Code
```java
package com.hands_on;

public class PrintSixAndFour {
    public static void main(String[] args) {
        byte six = 6, four = 4;
        System.out.println(six+" "+four);
    }
}
```
### Output
```bash
6 4
```

---
""")

st.subheader("**3. Initialize a byte variable `age` with the value 30. Then, print the value of `age` to the console.**")

st.markdown(
"""
### Analysis
In this program, we have initialized a byte variable `age` with the value 30.

### Code
```java
package com.hands_on;
import java.util.Scanner;

public class DisplayAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println(age);
    }
}
```
### Output
```bash
30
```

---
""")

st.subheader("**4. Declare three integer variables named `hundred`, `twoHundred`, and `threeHundred`, and initialize them with the values 10, 2000, and -30000 respectively. Then, reassign them with the corresponding number names. Finally, print the values of all three variables.**")

st.markdown(
"""
### Analysis
In this program, we have declared three integer variables `hundred`, `twoHundred`, and `threeHundred`, and initialized them with the values 10, 2000, and -30000 respectively. Then, we reassigned them with the corresponding number names.

### Code
```java
package com.hands_on;
import java.util.Scanner;

public class GetThreeUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short hundred = 10, twoHundred = 2000, threeHundred = -30000;
        hundred = scanner.nextShort();
        twoHundred = scanner.nextShort();
        threeHundred = scanner.nextShort();
        System.out.println(hundred+\"\\n\"+twoHundred+\"\\n\"+threeHundred);
    }
}
```

### Output
```bash
100 200 300
```

---
""")

st.subheader("**5. Declare a variable `bookPrice` (Choose the right datatype). Assign the value 150.50 to `bookPrice`. Print the price. Now, re-assign a value to `bookPrice` then print `bookPrice`.**")

st.markdown(
"""
### Analysis
In this program, we have declared a double variable `bookPrice` and assigned the value 150.50 to `bookPrice`. Then, we reassigned a value to `bookPrice` and printed `bookPrice`.

### Code
```java

package com.hands_on;
import java.util.Scanner;

public class ChangeBookPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 150.50;
        System.out.println(price);
        price = scanner.nextDouble();
        System.out.println(price);
    }
}
```

### Output
```bash
150.50
200.50
```

---
""")

st.subheader("**6. Declare the variables for the marks of the subjects `Tamil`, `English`, and `French`. Initialize or assign them with the scores 95,99 and 100 respectively. Print them in separate lines.**")

st.markdown(
"""
### Analysis
In this program, we have declared three integer variables `Tamil`, `English`, and `French` and initialized them with the scores 95, 99, and 100 respectively. Then, we printed them in separate lines.

### Code
```java
package com.hands_on;

public class DisplaySubjectMarks {
    public static void main(String[] args) {
        int Tamil = 95, English = 99, French = 100;
        System.out.println(Tamil+" "+English+" "+French);
    }
}
```

### Output
```bash
95 99 100
```

---
""")

st.subheader("**7. Create two variables to store a student's name and his/her age. Assign/initialize them with the appropriate values and display the data.**")

st.markdown(
"""
### Analysis
In this program, we have created two variables to store a student's name and his/her age. We have assigned/initialized them with the appropriate values and displayed the data.

### Code
```java

package com.hands_on;
import java.util.Scanner;

public class DisplayStudentNameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Student = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(Student + "\n" + age);
    }
}
```

### Output
```bash
Shabari K S
21
```

---
""")

st.subheader("**8. Create the variables for a player's name, age, height in cm, weight in kg, rank, and mobile number, and assign the values of your choice. Display the player detail. (byte, short, int, double, String datatypes can be used).**")

st.markdown(
"""
### Analysis
In this program, we have created the variables for a player's name, age, height in cm, weight in kg, rank, and mobile number, and assigned the values of our choice. We have displayed the player detail.

### Code
```java

package com.hands_on;

import java.util.Scanner;

public class GetPlayerDetailsAndDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        String rank = scanner.nextLine();
        int mobileNumber = scanner.nextInt();

        System.out.println("Name = "+playerName);
        System.out.println("Age = "+age);
        System.out.println("Height = "+height);
        System.out.println("Weight = "+weight);
        System.out.println("Rank = "+rank);
        System.out.println("Mobile Number = "+mobileNumber);
    }
}
```

### Output

```bash
Shabari K S
21
170
60
elite
1234567890

Name = Shabari K S
Age = 21
Height = 170.0
Weight = 60.0
Rank = elite
Mobile Number = 1234567890
```

---
""")

st.subheader("**9. Read a person's name first, read another person and another. Greet the first person first, the third person second and the second person last. If `Chloe`, `Joey` & `Zoe` are the inputs, then the output will be `Welcome Chloe! Welcome Zoe! Welcome Joey too!`**")

st.markdown(
"""
### Analysis
In this program, we have read a person's name first, read another person and another. We have greeted the first person first, the third person second, and the second person last.

### Code
```java

package com.hands_on;

import java.util.Scanner;

public class GreetThreePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstPerson = sc.nextLine();
        String secondPerson = sc.nextLine();
        String thirdPerson = sc.nextLine();

        System.out.println("Welcome " + firstPerson + "!");
        System.out.println("Welcome " + thirdPerson + "!");
        System.out.println("Welcome " + secondPerson + "!");
    }
}
```

### Output
    
```bash
Chloe
Joey
Zoe
Welcome Chloe!
Welcome Zoe!
Welcome Joey!
```

---
""")

st.subheader("**10. Write a Java program to add 8 to the given number and then divide it by 3. Now, the modulus of the quotient is taken with 5, and then multiply the resultant value by 5. Display the result.**")

st.markdown(
"""
### Analysis
In this program, we have added 8 to the given number and then divided it by 3. Now, the modulus of the quotient is taken with 5, and then multiplied the resultant value by 5.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = (((number + 3) / 3 ) % 5)*5;
        System.out.println(result);
    }
}
```

### Output
```bash
10
20
```

---
""")

st.subheader("**11. Write a Java program to accept 3 sides of triangle from user and print area of triangle as an output. (Library method can be used to find the square root)**")

st.markdown(
"""
### Analysis
In this program, we have accepted 3 sides of a triangle from the user and printed the area of the triangle as an output.

### Code
```java

package com.hands_on;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double semiPerimeter = (double) (a + b + c) / 2;
        double areaOfTriangle = Math.sqrt(
                                    semiPerimeter * (semiPerimeter - a)
                                    * (semiPerimeter - b) * (semiPerimeter - c)
                                );
        System.out.println("Area of Triangle : "+areaOfTriangle);
    }
}
```

### Output
```bash
3 4 5
Area of Triangle : 6.0
```

---
""")

st.subheader("**12. A factory-manufactured LED bulbs on the first day. On the second day, it made CFL bulbs. How many bulbs did the factory make altogether? Counts are the input**")

st.markdown(
"""
### Analysis
In this program, we have taken the input of the number of LED and CFL bulbs manufactured by the factory on the first and second days. Then, we have calculated the total number of bulbs manufactured by the factory.

### Code
```java

package com.hands_on;

import java.util.Scanner;

public class CountLEDAndCFLBulb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOne = scanner.nextInt();
        int dayTwo = scanner.nextInt();
        System.out.println(dayOne+dayTwo);
    }
}
```

### Output
```bash
100 200
300
```

---
""")

st.subheader(
"""
**13. Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write programs to swap the values of the two variables.**
1) **First program by using a third variable**
2) **Second program without using any third variable (use arithmetic operators)**
3) **Third program using using XOR operator**
""") 

st.markdown(
"""
### Analysis
In this program, we have swapped the values of two variables `a` and `b` using three different methods.


1. **First program by using a third variable**
### Code
```java
package com.hands_on;
import java.util.Scanner;
public class SwappingUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
```

### Output
```bash
6 8
8 6
```

2. **Second program without using any third variable (use arithmetic operators)**
### Code
```java
package com.hands_on;

import java.util.Scanner;

public class SwappingWithOutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
```

### Output
```bash
6 8
8 6
```

3. **Third program using using XOR operator**
### Code
```java
package com.hands_on;

import java.util.Scanner;

public class SwappingWithOutThirdVariableAndArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }
}
```

### Output
```bash
6 8
8 6
```

---
""")

st.subheader("**14.Assist the teacher in analyzing the students' fruit preferences recorded as follows:**")
st.markdown("""
1. **Determine the total number of students in the school who like oranges.**
1. **Determine the total number of students in the school who like mangoes.**
1. **Calculate the total number of students in the school overall.**
1. **Determine whether the number of girls exceeds the number of boys. State 'true' or 'false'.**
""") 

data = {
    'Student':["Girls", "Boys", "Total"],
    'Orange':[136, 128, '-'],
    'Mango':[240, 243, '-'],
    'Total':['-', '-', '-']
}

st.dataframe(data)

st.markdown(
"""
### Analysis
In this program, we have analyzed the students' fruit preferences recorded as follows:

1. Determine the total number of students in the school who like oranges.
2. Determine the total number of students in the school who like mangoes.
3. Calculate the total number of students in the school overall.
4. Determine whether the number of girls exceeds the number of boys. State 'true' or 'false'.

""")

st.subheader("**Code**")
st.markdown(
"""
```java
package com.hands_on;

public class TeacherAnalysis {
    public static void main(String[] args) {
        int girlsOrange = 136;
        int boysOrange = 128;
        int girlsMango = 240;
        int boysMango = 243;

        int totalOrange = girlsOrange + boysOrange;
        int totalMango = girlsMango + boysMango;
        int totalStudents = totalOrange + totalMango;
        int totalBoys = boysOrange + boysMango;
        int totalGirls = girlsOrange + girlsMango;

        System.out.println(
            "Total number of students in the school who like oranges: " 
            + totalOrange
        );
        System.out.println(
            "Total number of students in the school who like mangoes: " 
            + totalMango
        );
        System.out.println(
            "Total number of students in the school overall: " 
            + totalStudents
        );
        System.out.println(
            "Whether the number of girls exceeds the boys: " 
            + (totalGirls > totalBoys)
        );
    }
}
```

### Output
```bash
Total number of students in the school who like oranges: 264
Total number of students in the school who like mangoes: 483
Total number of students in the school overall: 747
Whether the number of girls exceeds the boys: true
```

---

""")

st.subheader(
"""
**15. Declare four variables numberOne, numberTwo, numberThree, and numberFour of integer type. Assign the values of your choice for the variables numberOne, numberTwo and numberThree. Assign 1000 to numberFour. Print the values. Now re-assign the values as follows to print,**
1. **numberOne’s value to numberTwo**
2. **numberTwo’s value to numberThree**
3. **numberThree’s value to numberFour**
4. **100 to numberOne**
""")

st.markdown(
"""
### Analysis
In this program, we have declared four integer variables `numberOne`, `numberTwo`, `numberThree`, and `numberFour`. We have assigned the values of our choice for the variables `numberOne`, `numberTwo`, and `numberThree`. We have assigned 1000 to `numberFour`. We have printed
the values and then reassigned the values as follows:

1. `numberOne`’s value to `numberTwo`
2. `numberTwo`’s value to `numberThree`
3. `numberThree`’s value to `numberFour`
4. 100 to `numberOne`

### Code
```java
package com.hands_on;

public class SwappingValuesOfFourVariable {
    public static void main(String[] args) {
        int numberOne = 10, numberTwo = 20,
            numberThree = 30, numberFour = 1000;
        System.out.println(
            numberOne + " " + numberTwo + " " 
            + numberThree + " " + numberFour
        );
        numberFour = numberThree;
        numberThree = numberTwo;
        numberTwo = numberOne;
        numberOne = 100;
        System.out.println(
            numberOne + " " + numberTwo + " " 
            + numberThree + " " + numberFour
        );
    }
}
```

### Output
```bash
10 20 30 1000
100 10 20 30
```

---
""")

st.subheader("**16. Write a Java application that takes a duration in minutes as input and calculates the equivalent duration in years and days.**")

st.markdown(
"""
### Analysis
In this program, we have taken the duration in minutes as input and calculated the equivalent duration in years and days.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class DurationInYearAndDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the duration in minutes: ");
        int minutes = scanner.nextInt();
        int days = minutes / 1440;
        int years = days / 365;
        days = days % 365;
        System.out.println("Years: " + years + " Days: " + days);
    }
}
```

### Output
```bash
Enter the duration in minutes: 
100029391
Years: 190 Days: 114
```

---
""")


st.subheader("**17. Write a Java program to reverse a 3-digit number.**")

st.markdown(
"""

### Analysis
In this program, we have reversed a 3-digit number.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
```

### Output
```bash
123
321
```

---
""")


st.subheader("**18. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.**")

st.markdown(
"""
### Analysis
In this program, we have calculated the total number of students in a class who secured grade 'A'.

### Code
```java
package com.hands_on;
public class GradeCalculator {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int boysWithGradeA = 20;

        // Calculate total students with grade 'A'
        int totalGradeA = totalStudents / 2;

        // Calculate total girls with grade 'A'
        int girlsWithGradeA = totalGradeA - boysWithGradeA;

        System.out.println(
            "Total girls getting grade 'A': " + girlsWithGradeA
        );
    }
}
```

### Output
```bash
Total girls getting grade 'A': 25
```

---
"""
)
st.markdown(
"""
### **19. Write a Java program to calculate Net Salary. User must input Basic Salary and Output should be net salary calculated based on following allowances:**
#### Allowances:
\tDA = 70% of Basic Salary\n
\tHRA = 7% of Basic Salary\n
\tMA = 2% of Basic Salary\n
\tTA = 4% of Basic Salary\n
#### Deduction:
\tPF = 12% of Basic Salary\n
\tIncome/professional tax = User Input (e.g., 500)\n
\tNet Salary = Basic Salary + Allowances – Deduction\n

""")

st.markdown(
"""
### Analysis
In this program, we have calculated the net salary based on the allowances and deductions.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.println("Enter the Income/professional tax: ");
        double tax = scanner.nextDouble();

        double DA = 0.7 * basicSalary;
        double HRA = 0.07 * basicSalary;
        double MA = 0.02 * basicSalary;
        double TA = 0.04 * basicSalary;
        double PF = 0.12 * basicSalary;

        double netSalary = basicSalary + DA + HRA + MA + TA - PF - tax;
        System.out.println("Net Salary: " + netSalary);
    }
}
```

### Output
```bash
Enter the Basic Salary: 
10000
Enter the Income/professional tax: 
500
Net Salary: 16600.0
```

---
"""
)

st.markdown(
"""
### 20. Anisha and Raja took their common pocket money to the market. Anisha bought Apples and Raju bought Bananas. On their way back they saw a Magic Money Vending Machine which gives the triple of the money deposited. They both tried with all the balance amount that they had. Now write a program to,
1. **Print the amount, they spent together in the market**
2. **Print the final amount that they had when they reach home**
3. **Print the amount they deposited in the magic machine**\n
**`Inputs`**: Pocket money, Apple cost, Banana cost
"""
)

st.markdown(
"""
### Analysis
In this program, we have calculated the amount spent by Anisha and Raja in the market, the final amount they had when they reached home, and the amount they deposited in the magic machine.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class MagicMoneyVendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pocket Money: ");
        double pocketMoney = scanner.nextDouble();
        System.out.println("Enter the Apple cost: ");
        double appleCost = scanner.nextDouble();
        System.out.println("Enter the Banana cost: ");
        double bananaCost = scanner.nextDouble();

        double amountSpent = appleCost + bananaCost;
        double finalAmount = pocketMoney - amountSpent;
        double depositAmount = finalAmount * 3;

        System.out.println("Amount spent in the market: " + amountSpent);
        System.out.println("Final amount when they reach home: " + finalAmount);
        System.out.println("Amount deposited in the magic machine: " + depositAmount);
    }
}
```

### Output
```bash
Enter the Pocket Money: 
1000
Enter the Apple cost: 
200
Enter the Banana cost: 
300
Amount spent in the market: 500.0
Final amount when they reach home: 500.0
Amount deposited in the magic machine: 1500.0
```

---
"""
)


st.markdown(
"""
### 21. A cashier in a shop has currency notes of denominations 10,50 and 100. If the amount to be returned is the input, find the total number of currency notes of each denomination that the cashier should give to the customer. Write a program to accomplish the above task. Assume that the input is in 10’s multiples.
"""
)

st.markdown(
"""
### Analysis
In this program, we have calculated the total number of currency notes of each denomination that the cashier should give to the customer.

### Code

```java
package com.hands_on;

import java.util.Scanner;

public class CurrencyNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();

        int hundredNotes = amount / 100;
        int fiftyNotes = (amount % 100) / 50;
        int tenNotes = ((amount % 100) % 50) / 10;

        System.out.println(
            "100 Notes: " + hundredNotes + \"\\n\" +
            "50 Notes: " + fiftyNotes + \"\\n\" +
            "10 Notes: " + tenNotes
        );
    }
}
```

### Output
```bash
Enter the amount:
450
100 Notes: 4
50 Notes: 1
10 Notes: 0
```

---
"""
)

st.subheader(
"""
22. Electricity bill calculator: Calculate the bill for 30 days based on the given below data.
1. **There are 2 fans of 60W each. Usage of each fan is 6 hours per day.**
1. **There are 3 lights of 40W each. Usage of each light is 8 hours per day.**
1. **For the other electrical appliances, the total consumption per day is 3000W.**
1. **Cost of 1 unit is Rs.6.00**
"""
)

st.markdown(
"""
### Analysis
In this program, we have calculated the electricity bill for 30 days based on the given data.

### Code
```java
package com.hands_on;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        int fanPower = 60;
        int fanUsage = 6;
        int lightPower = 40;
        int lightUsage = 8;
        int otherPower = 3000;
        int days = 30;
        double costPerUnit = 6.00;

        double fanConsumption = 2 * fanPower * fanUsage * days;
        double lightConsumption = 3 * lightPower * lightUsage * days;
        double otherConsumption = otherPower * days;
        double totalConsumption = fanConsumption + lightConsumption + 
                                  otherConsumption;
        double bill = totalConsumption / 1000 * costPerUnit;

        System.out.println("Electricity Bill: " + bill);
    }
}
```

### Output
```bash
Electricity Bill: 842.40
```

---
"""
)


st.subheader(
"""
23. Write a Java program to check whether the given number is odd or even. Don’t use comparison operator and decision statement.
"""
)

st.markdown(
"""
### Analysis
In this program, we have checked whether the given number is odd or even without using a comparison operator and decision statement.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        String[] result = {"Even", "Odd"};
        System.out.println(result[number & 1]);

    }
}
```

### Output
```bash
Enter the number:
10
Even
```

---
"""
)

st.subheader(
"""
24. Write a Java program to detect if two integers have opposite signs or not. Don’t use relational operator.
"""
)

st.markdown(
"""
### Analysis
In this program, we have detected whether two integers have opposite signs or not without using a relational operator.

### Code
```java


package com.hands_on;

import java.util.Scanner;

public class OppositeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        String[] res = {"Not opposite signs", "Opposite signs"};
        System.out.println(res[((number1 ^ number2)>>31) & 1]);
    }
}
```

### Output
```bash
Enter the first number:
-10
Enter the second number:
20
Opposite signs
```

---
"""
)


st.subheader(
"""
25. Write a Java program that increments a given number. Don't use arithmetic operators.
"""
)

st.markdown(
"""
### Analysis
In this program, we have incremented a given number without using arithmetic operators.

### Code
```java
package com.hands_on;

import java.util.Scanner;

public class IncrementNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int incrementedNumber = -~number;
        System.out.println("Incremented Number: " + incrementedNumber);
    }
}
```

### Output
```bash
Enter the number:
10
Incremented Number: 11
```

---
"""
)
