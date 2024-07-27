package usr.hands_on;

import usr.collections.StackADT;

public class Qn_1 {
    public static void main(String[] args) {
        StackADT<Integer> stack = new StackADT<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("removed element: "+stack.pop());
        System.out.println("top element in stack: " + stack.getTop());
        System.out.println("is the stack is empty? " +stack.isEmpty());
        stack.display();
    }
}
