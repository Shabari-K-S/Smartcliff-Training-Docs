package usr.hands_on;

import usr.collections.StackADT;

import java.util.Scanner;

public class Qn_4 {
    public static void main(String[] args) {
        StackADT<Character> stack = new StackADT<>();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        for(char c : str.toCharArray()){
            if (stack.getTop() == null){
                stack.push(c);
            } else if (stack.getTop() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        System.out.println(stack);


    }
}
