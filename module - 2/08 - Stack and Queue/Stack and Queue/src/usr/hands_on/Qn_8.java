package usr.hands_on;

import usr.collections.StackADT;

import java.util.Scanner;

public class Qn_8 {
    static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }
    static String postToPre(String post_exp) {
        StackADT<String> s = new StackADT<>();
        int length = post_exp.length();
        for (int i = 0; i < length; i++) {
            if (isOperator(post_exp.charAt(i))) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                String temp = post_exp.charAt(i) + op2 + op1;
                s.push(temp);
            }
            else {
                s.push(post_exp.charAt(i) + "");
            }
        }

        StringBuilder ans = new StringBuilder();
        for (Object i : s.toArray())
            ans.append(i);
        return ans.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your postfix expression: ");
        String post_exp = sc.nextLine();
        System.out.println("Prefix : "
                + postToPre(post_exp));
    }
}
