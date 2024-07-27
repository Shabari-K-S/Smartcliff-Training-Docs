package usr.practice;

import usr.collections.StackADT;

import java.util.Scanner;

public class InfixToPostfix {
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    // Function to return associativity of operators
    static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; // Default to left-associative
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackADT<Character> operators = new StackADT<>();
        StringBuilder postfix = new StringBuilder();

        System.out.println("Enter infix operators (without space in between): ");
        String opr = sc.nextLine();

        for (char c : opr.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                postfix.append(c);
            } else if (c == '(') {
                operators.push(c);
            }
            else if (c == ')') {
                while (!operators.isEmpty() && operators.getTop() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop();
            }
            else {
                while (!operators.isEmpty() && (c < prec(operators.getTop()) ||
                        prec(c) == prec(operators.getTop()) &&
                                associativity(c) == 'L')) {
                    postfix.append(operators.pop());
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        System.out.println(postfix);    }
}
