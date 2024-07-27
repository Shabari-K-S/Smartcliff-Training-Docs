package usr.hands_on;

import usr.collections.StackADT;

import java.util.Scanner;

public class Qn_5 {
    public static void main(String[] args) {
        StackADT<Character> stack = new StackADT<>();
        StackADT<Character> stack2 = new StackADT<>();
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        for (char c : input1.toCharArray()) {
            if (stack.isEmpty() && c != '#') {
                stack.push(c);
            } else if (c == '#') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for (char c : input2.toCharArray()) {
            if (stack2.isEmpty() && c != '#') {
                stack2.push(c);
            } else if (c == '#') {
                stack2.pop();
            } else {
                stack2.push(c);
            }
        }

        Object[] arr = stack.toArray();
        Object[] arr2 = stack2.toArray();

        boolean flag = false;
        if (stack.getTop() != null || stack.getTop() != null)
            if (arr[0] == arr2[0] && stack.getTop() == stack2.getTop()) {
                flag = true;
            }
        System.out.println(flag);




    }
}
