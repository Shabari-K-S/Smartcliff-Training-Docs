package usr.hands_on;

import usr.collections.StackADT;

public class Qn_6 {
    public static void main(String[] args) {
        StackADT<Integer> stack = new StackADT<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(1);
        stack.push(40);
        stack.push(5);
        stack.push(50);

        System.out.println(stack.getMin());
    }
}
